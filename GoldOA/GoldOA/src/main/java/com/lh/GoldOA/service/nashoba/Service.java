package com.lh.GoldOA.service.nashoba;

import java.util.Map;

import com.lh.GoldOA.domain.AccountTable;
import com.lh.GoldOA.domain.Employee;

public interface Service {
	/**向数据库添加单个员工数据*/
	public Map<String, Object> addAccount(Employee employee,AccountTable accountTable);
	/**向数据库添加多个员工数据*/
	
}
