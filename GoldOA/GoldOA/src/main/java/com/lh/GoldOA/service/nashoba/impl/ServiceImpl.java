package com.lh.GoldOA.service.nashoba.impl;

import java.util.HashMap;
import java.util.Map;
 
import com.lh.GoldOA.domain.Employee;
import com.lh.GoldOA.service.nashoba.Service;
/**
 * 主要处理ajax的业务
 * @author NashobaBrook
 * @date 2017年8月31日12:22:56
 */
public class ServiceImpl implements Service{

	@Override
	public Map<String, Object> add(Employee employee) {
		Map<String,Object> map = new HashMap<>();
		
		if (employee.getPhone().trim().equals("")||employee.getPhone() == null) {
			map.put("success", false);
			map.put("msg", employee.getName()+"未填写手机号,该项必填!");
		}
		//添加到数据库获得一个返回值
		boolean isInsert =false ;
		
		if (!isInsert) {
			map.put("success", false);
			map.put("msg", "数据库出错,请联系系统管理员!电话:13882041181");
		}
		
		
		
		return null;
	}

}
