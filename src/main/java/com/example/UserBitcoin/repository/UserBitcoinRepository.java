package com.example.UserBitcoin.repository;

import com.example.UserBitcoin.model.UserBitcoin;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBitcoinRepository extends  ReactiveMongoRepository<UserBitcoin, String> {
    
}
