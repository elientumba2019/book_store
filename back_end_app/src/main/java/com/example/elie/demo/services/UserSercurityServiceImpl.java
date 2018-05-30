package com.example.elie.demo.services;
import com.example.elie.demo.model.User;
import com.example.elie.demo.repository.UserDao;
import com.example.elie.demo.services.interfaces.UserSecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserSercurityServiceImpl implements UserSecurityService, UserDetailsService {


    private static final Logger LOG = LoggerFactory.getLogger(UserSercurityServiceImpl.class.getName());
    private UserDao userDao;





    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if(user == null){
            LOG.warn("Username {} , not found" , username);
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
        return user;
    }


    /******************* Dependency Injection setter**********/

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /******************* Dependency Injection end************/
}
