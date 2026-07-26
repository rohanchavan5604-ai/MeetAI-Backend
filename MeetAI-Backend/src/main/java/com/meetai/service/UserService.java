package com.meetai.service;

import java.util.List;

import com.meetai.entity.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

}