package com.lh.GoldOA.dao;
  

import com.lh.GoldOA.entity.AccountTable;  

/** 
 *主要的dao层接口
 */
public interface SystemDao { 
	
	/**
	 * 查找该账号对应的
	 * @return 返回值为AccountTable.返回查找到的用户:若未查询到就返回null;
	 */
	public  AccountTable selectAccount(AccountTable accountTable);
	 
	
}
