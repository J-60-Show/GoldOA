package com.lh.GoldOA.service;

import com.lh.GoldOA.entity.AccountTable;

/**
 * 
 */
public interface SystemService {
	/**
	 * 登录功能(做java后台验证)
	 * @param account 账号
	 * @param password 密码
	 * @return 该用户的账号
	 */
	public AccountTable login(AccountTable accountTable);
	
}
