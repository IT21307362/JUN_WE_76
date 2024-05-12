package com.paf.gymgoals.service;

import com.paf.gymgoals.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    
    User getByUserId(String id);

    List<User> getAllUsers();

    Map<String, String> deleteUserById(String id);

    User editUserById(String id, User user);
}
