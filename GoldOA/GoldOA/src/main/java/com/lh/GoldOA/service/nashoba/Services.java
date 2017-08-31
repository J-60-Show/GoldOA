package com.lh.GoldOA.service.nashoba;

import java.util.List;
import java.util.Map;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.domain.em.Employee;
import com.lh.GoldOA.domain.em.ShowEmployee;
import com.lh.GoldOA.domain.log.Log;

public interface Services {
	/**向数据库添加单个员工数据*/
	public Map<String, Object> addAccount(Employee employee,AccountTable accountTable);
	/**向数据库添加多个员工数据*/
	
	/**向数据库查询分页查询的结果*/
	public List<ShowEmployee> findByPage(int page,int length);
	
	/**向数据库查询总条数*/
	public Integer findAll();
	
	/**向数据库查询ById*/
	public ShowEmployee findById(int id);
	
	/**修改账号的信息*/
	public Map<String, Object>  updateAccount(Employee employee,AccountTable accountTable);
	/**查询日志*/
	public List<Log> findLog(int state);
	
}
