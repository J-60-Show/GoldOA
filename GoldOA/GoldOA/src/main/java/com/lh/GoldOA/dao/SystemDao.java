package com.lh.GoldOA.dao;

import java.util.List;

import com.lh.GoldOA.entity.AccountTable;

/** 
 *主要的dao层接口
 */
public interface SystemDao {
	/**
	 * 查找所有的用户
	 * @return 返回装有Account的List集合
	 */
	public List<AccountTable> selectAccount();
	
	
}
