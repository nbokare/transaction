package com.nbokare.user;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public Collection<User> listUsers() {
        logger.info("Getting users");
        List<User> users = userRepository.findAll();
        return users;
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        logger.info("Creating user " + user.toString());
        userRepository.save(user);
        // return new User("Nikhil", "Bokare");
    }
}
