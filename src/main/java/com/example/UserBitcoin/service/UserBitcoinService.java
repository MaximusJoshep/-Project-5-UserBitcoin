package com.example.UserBitcoin.service;

import com.example.UserBitcoin.model.UserBitcoin;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserBitcoinService {
    Flux<UserBitcoin> findAll();
	 Mono<UserBitcoin> save(UserBitcoin userBitcoin);
	 Mono<UserBitcoin> findById(String id);	
	 Mono<UserBitcoin> update(UserBitcoin  userBitcoin);
	 void delete(String id);
	

    
}
