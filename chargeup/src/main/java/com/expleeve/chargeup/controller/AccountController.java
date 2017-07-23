package com.expleeve.chargeup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expleeve.chargeup.entity.Account;
import com.expleeve.chargeup.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Account getAccount(@PathVariable Long id) {
		return accountService.getAccountById(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
    	accountService.deleteAccountById(id);
    }
}
