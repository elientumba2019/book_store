package com.example.elie.demo.services.interfaces;

import com.example.elie.demo.model.User;
import com.example.elie.demo.model.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);
}
