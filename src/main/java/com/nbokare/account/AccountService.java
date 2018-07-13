package com.nbokare.account;

import com.nbokare.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AccountRepository accountRepository;

    public void addAccount(Account account) {
        logger.info("Adding account");
        accountRepository.save(account);
        logger.info("Added account");
    }

    public List<Account> listUsers() {
        logger.info("Listing account");
        List<Account> accounts = accountRepository.findAll();
        logger.info("Got {} accounts", accounts.size());
        return accounts;
    }
}
