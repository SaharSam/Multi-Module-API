package me.sahar.service.impl;

import me.sahar.dao.UserRepository;
import me.sahar.entity.User;
import me.sahar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User find() {

        return userRepository.find();
    }
}
