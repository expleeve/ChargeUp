package com.expleeve.chargeup.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.expleeve.chargeup.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UsersControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void saveUser() throws Exception{
//		User user = new User();
//		user.setUsername("test1");
//		user.setPassword("password1");
//		user.setDisplayname("test1");
//		user.setDesc4user("desc");
//		mvc.perform(MockMvcRequestBuilders.post("/users/saveOne", user).accept(MediaType.APPLICATION_JSON))
//        .andExpect(status().isOk())
//        .andExpect(content().string(new IsEqual<String>("Hello World!")));
	}
}
