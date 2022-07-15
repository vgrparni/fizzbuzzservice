package com.fizzbuzz.api.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	/**
	 * This service provide information for requested number is fizz or buzz or both
	 * @param number 
	 * @return
	 */
	@RequestMapping("/fizzbuzzplay/{number}")
	public String getFizzBuzzToGivenNUmber(@PathVariable("number") String number) {
		
		return number;
		
	}

}
