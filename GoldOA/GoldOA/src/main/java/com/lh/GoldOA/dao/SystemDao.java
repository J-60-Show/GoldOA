package com.lh.GoldOA.dao;

import com.lh.GoldOA.entity.Employee;

/** 
 *主要的dao层接口
 */
public interface SystemDao {

	/**
	 * 登录方法
	 * @param account 账号
	 * @param password 密码
	 * @return 返回员工对象 登录错误返回空
	 */
	Employee login(String account,String password);
	
}
