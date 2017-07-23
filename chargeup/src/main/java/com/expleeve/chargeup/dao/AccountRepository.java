package com.expleeve.chargeup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expleeve.chargeup.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
