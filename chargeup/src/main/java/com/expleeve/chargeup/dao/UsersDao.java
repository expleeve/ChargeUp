package com.expleeve.chargeup.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.expleeve.chargeup.entity.User;

@Repository
public class UsersDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public boolean saveUser(User user){
		if(user == null){
			return false;
		}
		int res = em.createNativeQuery("insert into users(username, password, displayname, desc4user) "
				+ "select ?, ?, ?, ? from dual where not exists "
				+ "(select * from users where username = ?) ")
		.setParameter(1, user.getUsername())
		.setParameter(2, user.getPassword())
		.setParameter(3, user.getDisplayname())
		.setParameter(4, user.getDesc4user())
		.setParameter(5, user.getUsername()).executeUpdate();
		return res > 0;
	}
}
