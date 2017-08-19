package com.lh.GoldOA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.entity.AccountTable;

/**
 * 主控制器
 * (建议只做get方法的请求)
 */

@Controller
public class SystemController {
	/**
	 * 主页登陆
	 * @return
	 */
	@RequestMapping(value={"/index","/","index.{anything}"},method=RequestMethod.GET)
	public String index(@ModelAttribute AccountTable accountTable ){
		return "index";
	}

	/**
	 * function页面
	 * @return
	 */
	@RequestMapping(value={"/function"},method=RequestMethod.GET)
	public String function(){
		return "function";
	}

	/**
	 * staffmanagement页面
	 * @return
	 */
	@RequestMapping(value={"/staffmanagement"},method=RequestMethod.GET)
	public String staffmanagement(){
		return "staffmanagement";
	}
	
	
}
