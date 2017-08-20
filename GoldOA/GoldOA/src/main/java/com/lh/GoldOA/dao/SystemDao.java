package com.lh.GoldOA.dao;
  

import com.lh.GoldOA.entity.AccountTable;
import com.lh.GoldOA.entity.Sell;  

/** 
 *主要的dao层接口
 */
public interface SystemDao { 
	
	/**
	 * 查找该账号对应的
	 * @return 返回值为AccountTable.返回查找到的用户:若未查询到就返回null;
	 */
	public  AccountTable selectAccount(AccountTable accountTable);
	
	
	/**
	 * 录入员工销售情况
	 * @param sell 销售单
	 * @return 返回受影响的行数
	 */
	int insertSell (Sell sell);
	 
	
}
