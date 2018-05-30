package com.example.elie.demo;

import com.example.elie.demo.config.SecurityUtility;
import com.example.elie.demo.model.User;
import com.example.elie.demo.model.security.Role;
import com.example.elie.demo.model.security.UserRole;
import com.example.elie.demo.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookStoreApplication{



    UserService userService;


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }


    /*
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setUsername("j");
        user.setPassword(SecurityUtility.passwordEncoder().encode("j"));
        user.setEmail("jdoe@qq.com");

        Set<UserRole> userRoles = new HashSet<>();
        Role role = new Role();
        role.setName("ROLE_USER");
        userRoles.add(new UserRole(user , role));


        userService.createUser(user , userRoles);
        userRoles.clear();



        User user2 = new User();
        user2.setFirstName("Johnny");
        user2.setLastName("Deep");
        user2.setUsername("admin");
        user2.setPassword(SecurityUtility.passwordEncoder().encode("p"));
        user2.setEmail("jdeep@qq.com");

        Role role2 = new Role();
        role.setName("ROLE_ADMIN");
        userRoles.add(new UserRole(user2 , role));


        userService.createUser(user , userRoles);
    }
    */
}
