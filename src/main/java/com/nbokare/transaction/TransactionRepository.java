package com.nbokare.transaction;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nbokare.account.Account;

public interface TransactionRepository extends MongoRepository<Transaction, Long> {

}
