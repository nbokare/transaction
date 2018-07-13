package com.nbokare.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        logger.info("Adding user");

        userRepository.save(user);
        logger.info("Added user");
    }

    public List<User> listUsers() {
        logger.info("Listing user");
        logger.debug("THIS IS A DEBUG LOG");
        List<User> users = userRepository.findAll();
        logger.info("Got {} users", users.size());
        return users;
    }
}
