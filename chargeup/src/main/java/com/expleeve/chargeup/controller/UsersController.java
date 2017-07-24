package com.expleeve.chargeup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.expleeve.chargeup.consts.ResultState;
import com.expleeve.chargeup.dto.ResultDTO;
import com.expleeve.chargeup.entity.User;
import com.expleeve.chargeup.service.UsersService;

/**
 * 
 * 
 * @author expleeve
 * @date 2017年7月20日 下午11:43:27
 *
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService userService;

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll(){
		return JSON.toJSONString(userService.findAll());
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
//	@ResponseBody
	public ResultDTO signUp(User user){
		boolean res = userService.saveUser(user);
		ResultDTO dto = new ResultDTO();
		if(!res){
			dto.setState(ResultState.FAILURE);
			dto.setMsg("用户已存在");
		}
		return dto;
	} 
	
}
