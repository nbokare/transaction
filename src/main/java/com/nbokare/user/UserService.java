package com.nbokare.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> listUsers(int userId) {
        List<User> users = userRepository.findAll();
        return users;
    }
}
