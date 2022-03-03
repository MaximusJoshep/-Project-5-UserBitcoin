package com.example.UserBitcoin.service.Impl;

import com.example.UserBitcoin.model.UserBitcoin;
import com.example.UserBitcoin.repository.UserBitcoinRepository;
import com.example.UserBitcoin.service.UserBitcoinService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RequiredArgsConstructor
@Service
public class UserBitcoinImpl  implements UserBitcoinService {
    private final UserBitcoinRepository repository;

    @Override
    public Flux<UserBitcoin> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<UserBitcoin> save(UserBitcoin userBitcoin) {
        return repository.save(userBitcoin);
    }

    @Override
    public Mono<UserBitcoin> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<UserBitcoin> update(UserBitcoin userBitcoin) {
        return repository.save(userBitcoin);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
        
    }
    
}
