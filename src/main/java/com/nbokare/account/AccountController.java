package com.nbokare.account;

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
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = "/accounts", method = RequestMethod.GET)
    public Collection<Account> listUsers() {
        logger.info("Getting users");
        List<Account> accounts = accountRepository.findAll();

        return accounts;
    }

    @RequestMapping(path = "/accounts", method = RequestMethod.POST)
    public void createUser(@RequestBody Account account) {
        logger.info("Creating user " + account.toString());
        accountRepository.save(account);
        // return new User("Nikhil", "Bokare");
    }
}
