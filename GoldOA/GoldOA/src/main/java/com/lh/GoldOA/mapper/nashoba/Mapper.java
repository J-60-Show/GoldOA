package com.lh.GoldOA.mapper.nashoba;

import com.lh.GoldOA.domain.AccountTable;
import com.lh.GoldOA.domain.Employee;

public interface Mapper {
	/**添加员工信息*/
	public boolean insertIntoEmployee(Employee employee);
	
	/**添加员工账号*/
	public boolean insertIntoAccountTable(AccountTable accountTable);
}
