package com.example.elie.demo.services;

import com.example.elie.demo.model.User;
import com.example.elie.demo.model.security.UserRole;
import com.example.elie.demo.repository.RoleDao;
import com.example.elie.demo.repository.UserDao;
import com.example.elie.demo.services.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private UserDao userDao;
    private RoleDao roleDao;
    private final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class.getName());



    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        User localUser = userDao.findByUsername(user.getUsername());
        if(localUser != null){
            LOG.info("User with username {} already exist" , user.getUsername());
        }
        else {
            for(UserRole ur : userRoles){
                roleDao.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            localUser = userDao.save(user);
        }
        return localUser;
    }



    /********************** DI setters*************************/
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
    /********************** DI setters end*********************/
}
