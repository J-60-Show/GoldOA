package com.lh.GoldOA.service;

import com.lh.GoldOA.entity.AccountTable;
import com.lh.GoldOA.entity.Sell;

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
	
	
	
	/**
	 * 销售录入功能
	 * @param sell 销售单对象
	 * @return 成功返回true 失败返回false
	 */
	boolean sell(Sell sell);
	
}
