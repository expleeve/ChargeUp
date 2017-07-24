package com.expleeve.chargeup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expleeve.chargeup.dto.AccountDTO;
import com.expleeve.chargeup.dto.ResultDTO;
import com.expleeve.chargeup.entity.Account;
import com.expleeve.chargeup.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	/**
	 * 查询一笔账单
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Account getAccount(@PathVariable Long id) {
		return accountService.getAccountById(id);
    }

    /**
     * 删除一笔账单
     * @param id
     */
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteAccount(@PathVariable Long id) {
    	accountService.deleteAccountById(id);
    }
    
    /**
     * 根据查询条件查询账单
     * @param dto
     * @return
     */
    public ResultDTO findAccountByCondition(AccountDTO dto){
    	return null;
    }
    
    /**
     * 添加一笔账单
     * @param account
     * @return
     */
    public ResultDTO addAnAccount(Account account){
    	return null;
    }
}
