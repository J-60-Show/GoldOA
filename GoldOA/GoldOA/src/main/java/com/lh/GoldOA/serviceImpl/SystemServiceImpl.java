package com.lh.GoldOA.serviceImpl;

import com.lh.GoldOA.entity.AccountTable;
import com.lh.GoldOA.service.SystemService;

public class SystemServiceImpl implements SystemService {
	
	/**
	 * 登录功能(做java后台验证)
	 * @param account 账号
	 * @param password 密码
	 * @return 该用户的账号
	 */
	@Override
	public AccountTable login(String account, String password) {
		if (account.trim()==null||password.trim()==null) {
			return null;
		}
		
		
		
		
		return null;
	}

}
