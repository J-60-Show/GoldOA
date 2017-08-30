package com.lh.GoldOA.service;


import com.lh.GoldOA.domain.AccountTable;
import com.lh.GoldOA.domain.Sell;



/**
 * 
 */
public interface SystemService {
	/**
	 * 登录功能(做java后台验证)
	 * @param AccountTable 前端传来一个包装好的AccountTable对象
	 * @return 该用户的账号
	 */
	public AccountTable login(AccountTable accountTable);
	/**
	 * 每个页面的Session检查
	 * @param account 账号
	 * @return 返回AccountTable.若不存在则返回NULL
	 */
	public AccountTable chlickSession(String account);
	
	
	
	
	/**
	 * 销售录入功能
	 * @param sell 销售单对象
	 * @return 成功返回true 失败返回false
	 */
	boolean sell(Sell sell);
	
}
