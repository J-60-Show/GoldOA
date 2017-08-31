package com.lh.GoldOA.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.service.SystemService;
/**
 * 对于staffmanagement页面的所有请求进行后台操作
 * @author NashobaBrook
 * @date	2017年8月29日12:21:54
 *
 */

@Controller
public class StaffmanagementMethod {
	
	private SystemService systemService;
	
	@Autowired
	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}




	/**
	 * 负责添加数据
	 * @return	返回一个json对象,反馈给页面是否添加成功,若失败则反馈失败信息
	 */
	@RequestMapping(value={"/addAccount","/addAccount.{anything}"},method=RequestMethod.POST)
	public Map<String,Object> addAccount(AccountTable accountTable){
		return null;  
		
	}
	
	
	
	
	
}
