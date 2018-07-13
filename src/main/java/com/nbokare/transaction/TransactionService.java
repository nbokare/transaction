package com.nbokare.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TransactionService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TransactionRepository transactionRepository;

    public Collection<Transaction> listTransactions() {
        logger.info("Getting all transactions");
        List<Transaction> transactions = transactionRepository.findAll();
        logger.info("Got " + transactions.size() + " transactions");
        return transactions;
    }
}
