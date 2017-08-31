package com.lh.GoldOA.controller.nashobrook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.domain.em.Employee;
import com.lh.GoldOA.domain.em.ShowEmployee;
import com.lh.GoldOA.domain.log.Log;
import com.lh.GoldOA.service.nashoba.Services;

@Controller
public class AjaxController {
	@Autowired
	private Services services;
	
	
	
	/**ajax请求添加员工*/
	@RequestMapping(value={"/addEmployee","/addEmployee.html","/addEmployee.{anything}"},method=RequestMethod.POST)
	@ResponseBody
	public Object addEmployee(Employee employee,AccountTable accountTable){
		Map<String, Object> map = services.addAccount(employee, accountTable);
		return map;
	}
	
	/**ajax请求批量添加员工*/
	@RequestMapping(value={"/addEmployees","/addEmployees.html","/addEmployees.{anything}"},method=RequestMethod.POST)
	@ResponseBody	
	public Object addEmployees(){
		Map<String, Object> map = new HashMap<>();
		return map;
	}
	
	/**ajax请求查询员工数据分页*/
	@RequestMapping(value={"/findEmployees","/findEmployees.html","/findEmployees.{anything}"},method=RequestMethod.POST)
	@ResponseBody	
	public Object findEmployeeByPage(int page,int length){
		List<ShowEmployee> list = services.findByPage(page, length);
		return list;
	}
	
	/**ajax请求查询员工总数*/
	@RequestMapping(value={"/length","/length.html","/length.{anything}"},method=RequestMethod.POST)
	@ResponseBody	
	public Object length(){
		return services.findAll(); 
	}	
	
	/**ajax请求查询员工根据ID*/
	@RequestMapping(value={"/findEmployee","/findEmployee.html","/findEmployee.{anything}"},method=RequestMethod.POST)
	@ResponseBody	
	public Object findEmployeeById(int id){
		ShowEmployee showEmployee = services.findById(id);
		return showEmployee;
	}
	/**ajax请求查询员工根据ID*/
	@RequestMapping(value={"/update","/update.html","/update.{anything}"},method=RequestMethod.POST)
	@ResponseBody	
	public Object updateEmployee(Employee employee,AccountTable accountTable){
		Map<String, Object> map = services.updateAccount(employee, accountTable);
		return map;
	}

	/**ajax请求查询日志根据状态*/
	@RequestMapping(value={"/log","/log.html","/log.{anything}"},method=RequestMethod.POST)
	@ResponseBody	
	public Object log(int state){
		List<Log> list = services.findLog(state);
		
		return list;
	}
	
}
