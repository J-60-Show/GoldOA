package com.lh.GoldOA.mapper.nashoba;

import java.util.List;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.domain.em.Employee;
import com.lh.GoldOA.domain.em.ShowEmployee;
import com.lh.GoldOA.domain.log.Log;

public interface Mapper {
	/**添加员工信息*/
	public boolean insertIntoEmployee(Employee employee);
	
	/**添加员工账号*/
	public boolean insertIntoAccountTable(AccountTable accountTable);
	
	/**修改员工基本信息*/
	public boolean updateEmployee(Employee employee);
	
	/**修改员工的权限*/
	public boolean updateAccountTable(AccountTable accountTable);
	
	/**查询员工信息*/
	public List<ShowEmployee> selectByPage(int start,int end);
	
	/**查询所有员工的总数*/
	public Integer selectAccount();
	/**查询单个员工*/
	public ShowEmployee selectById(int id);
	/**查询日志ByState*/
	public List<Log> selectLogByState(int state);
}
