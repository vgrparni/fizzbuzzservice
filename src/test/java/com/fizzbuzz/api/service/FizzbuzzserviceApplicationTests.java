package com.fizzbuzz.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest
class FizzbuzzserviceApplicationTests {

	@Autowired
	MockMvc mockMvc;
	 private final String INVALID_INPUT="Invalid input number";
	
	
	@Test
	void verifyFizzBuzzToGivenNumberAvailable() throws Exception {
		  mockMvc.perform(get("/fizzbuzzplay/2")) 
		  .andExpect(status().is(200));
    }
	
	@Test
	void getFizzToGivenNumber() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/fizzbuzzplay/3");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Fizz", result.getResponse().getContentAsString());
       
    }
	
	@Test
	void getBuzzToGivenNumber() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/fizzbuzzplay/5");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Buzz", result.getResponse().getContentAsString());
       
    }
	
	@Test
	void getFizzBuzzToGivenNumber() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/fizzbuzzplay/15");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("FizzBuzz", result.getResponse().getContentAsString());
       
    }
	
	@Test
	void invlidGivenNumber() throws Exception {
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/fizzbuzzplay/-3");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(INVALID_INPUT, result.getResponse().getContentAsString());
       
    }

}
