package com.fizzbuzz.api.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class FizzbuzzserviceApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	void verifyFizzBuzzToGivenNumberAvailable() throws Exception {
		  mockMvc.perform(get("/fizzbuzzplay/2")) 
		  .andExpect(status().is(200));
    }

}
