package com.expleeve.chargeup.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.core.IsEqual;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AccountControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void findAccount() throws Exception{
		
		mvc.perform(MockMvcRequestBuilders.get("/account/1").accept(MediaType.ALL))
        .andExpect(status().isOk());
	}
	
	@Test
	public void deleteAccount() throws Exception{
		mvc.perform(MockMvcRequestBuilders.delete("/account/1").accept(MediaType.ALL))
        .andExpect(status().isOk());
	}
}
