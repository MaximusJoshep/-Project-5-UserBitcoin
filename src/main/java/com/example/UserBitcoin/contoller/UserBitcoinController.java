package com.example.UserBitcoin.contoller;

import com.example.UserBitcoin.model.UserBitcoin;
import com.example.UserBitcoin.service.UserBitcoinService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RequiredArgsConstructor
@RequestMapping("/user-bitcoin")
public class UserBitcoinController {
    private final UserBitcoinService service;
	
	@GetMapping("/findAll")
	public Flux<UserBitcoin> getUserBitcoin(){
		return service.findAll();
	}
	
	@PostMapping("/save")
	Mono<UserBitcoin> postUserBitcoin(@RequestBody UserBitcoin UserBitcoin)
	{
		return service.save(UserBitcoin);
	}
	@PostMapping("/update")
	public Mono<UserBitcoin> saveProduct(@RequestBody UserBitcoin UserBitcoin){
		
		return service.save(UserBitcoin);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable String id){
		
		service.delete(id);
	}
	
	@GetMapping("/findbyid/{id}")
	public Mono<UserBitcoin> findById(@PathVariable String id){
		return service.findById(id);
	}
    
}
