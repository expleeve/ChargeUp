package com.expleeve.chargeup.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleeve.chargeup.dao.UsersDao;
import com.expleeve.chargeup.dao.UsersRepository;
import com.expleeve.chargeup.entity.User;

@Service
public class UsersService {
	
	private static final Logger logger = LoggerFactory.getLogger(UsersService.class);

	@Autowired
	private UsersRepository repository;
	
	@Autowired
	private UsersDao dao;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	@Transactional
	public boolean saveUser(User user){
		return dao.saveUser(user);
	}
}
