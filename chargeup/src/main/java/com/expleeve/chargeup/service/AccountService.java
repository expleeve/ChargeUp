package com.expleeve.chargeup.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleeve.chargeup.dao.AccountRepository;
import com.expleeve.chargeup.entity.Account;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repository;

	public Account getAccountById(Long id) {
		return repository.findOne(id);
	}

	@Transactional
	public void deleteAccountById(Long id) {
		repository.delete(id);
	}
	
}
