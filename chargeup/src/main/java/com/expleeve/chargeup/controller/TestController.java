package com.expleeve.chargeup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test
 * 
 * @author expleeve
 * @date 2017年7月20日 下午11:26:16
 *
 */
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test(){
		return "Hello World!";
	}
	
}
