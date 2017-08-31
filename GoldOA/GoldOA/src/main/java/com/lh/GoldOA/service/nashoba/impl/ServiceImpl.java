package com.lh.GoldOA.service.nashoba.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.domain.em.Employee;
import com.lh.GoldOA.domain.em.ShowEmployee;
import com.lh.GoldOA.domain.log.Log;
import com.lh.GoldOA.mapper.nashoba.Mapper;
import com.lh.GoldOA.service.nashoba.Services;
/**
 * 主要处理ajax的业务
 * @author NashobaBrook
 * @date 2017年8月31日12:22:56
 */
@Service
public class ServiceImpl implements Services{
	@Autowired
	private Mapper mapper;
	
	/**
	 * 添加员工
	 * 
	 * 返回值为带处理后的信息的map
	 */
	@Override
	public Map<String, Object> addAccount(Employee employee,AccountTable accountTable) {
		Map<String,Object> map = new HashMap<>();
		//若时间未设置就设置为当前时间
		if (employee.getGetDay() == null) {
			//设置时间为当前时间
			employee.setGetDay(new Date());
		}
		
		if (accountTable == null) {
			map.put("success", false);
			map.put("msg", "请填写权限!");
			return map;
		}
		//设置系统默认值
		accountTable.setPassword("123456");
		try {
			accountTable.setAccount(accountTable.getAccount());
		} catch (Exception e) {
			map.put("success", false);
			map.put("msg", "请填写姓名!");
			return map;
		}

	
		if (employee.getPhone().trim().equals("")||employee.getPhone() == null) {
			map.put("success", false);
			map.put("msg", employee.getName()+"未填写手机号,该项必填!");
			return map;
		}
		//添加到数据库获得一个返回值
		boolean isInsertEmployee =false ;
		isInsertEmployee = mapper.insertIntoEmployee(employee);
		boolean isInsertAccount =false;
		isInsertAccount = mapper.insertIntoAccountTable(accountTable);
		if (!isInsertEmployee|| !isInsertAccount) {
			map.put("success", false);
			map.put("msg", "数据库出错,请联系少爷!电话:13882041181");
			return map;
		}else{
			map.put("success", true);
			map.put("msg", "添加成功,您可以继续添加!");
			return map;
		} 
	}

	@Override
	/**
	 * 分页查询Employee
	 * page 为下标
	 * length 为一页显示多少内容
	 */
	public List<ShowEmployee> findByPage(int page, int length) {
		 int start = (page-1)*length;
		 int end = page*length;
		 List<ShowEmployee> list = mapper.selectByPage(start, end);
		 return list;
	}

	@Override
	/**
	 * 总条数
	 */
	public Integer findAll() { 
		return mapper.selectAccount();
	}

	@Override
	public ShowEmployee findById(int id) { 
		
		return mapper.selectById(id);
	}

	@Override
	public Map<String, Object> updateAccount(Employee employee, AccountTable accountTable) {
		Map<String,Object> map = new HashMap<>();
		//若时间未设置就设置为当前时间
		if (employee.getGetDay() == null) {
			//设置时间为当前时间
			employee.setGetDay(new Date());
		}
		
		if (accountTable == null) {
			map.put("success", false);
			map.put("msg", "请填写权限!");
			return map;
		}
		//设置系统默认值
		accountTable.setPassword("123456");
		try {
			accountTable.setAccount(accountTable.getAccount());
		} catch (Exception e) {
			map.put("success", false);
			map.put("msg", "请填写姓名!");
			return map;
		}

	
		if (employee.getPhone().trim().equals("")||employee.getPhone() == null) {
			map.put("success", false);
			map.put("msg", employee.getName()+"未填写手机号,该项必填!");
			return map;
		}
		//添加到数据库获得一个返回值
		boolean isInsertEmployee =false ;
		isInsertEmployee = mapper.updateEmployee(employee);
		boolean isInsertAccount =false;
		isInsertAccount = mapper.updateAccountTable(accountTable);
		if (!isInsertEmployee|| !isInsertAccount) {
			map.put("success", false);
			map.put("msg", "数据库出错,请联系少爷!电话:13882041181");
			return map;
		}else{
			map.put("success", true);
			map.put("msg", "添加成功,您可以继续添加!");
			return map;
		}  
	}

	@Override
	public List<Log> findLog(int state) {
		
		
		return mapper.selectLogByState(state);
	}

}
