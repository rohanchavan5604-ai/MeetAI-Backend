package com.meetai.serviceimpl;

import org.springframework.stereotype.Service;

import com.meetai.entity.User;
import com.meetai.repository.UserRepository;
import com.meetai.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}