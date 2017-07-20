package com.expleeve.chargeup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expleeve.chargeup.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
