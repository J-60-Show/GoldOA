package com.lh.GoldOA.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.domain.AccountTable;
import com.lh.GoldOA.service.SystemService;

/**
 * 主控制器
 * (建议只做get方法的请求)
 */

@Controller
public class SystemController { 
	
	private SystemService service;
	
	@Autowired
	public void setService(SystemService service) {
		this.service = service;
	}

	/**
	 * 主页登陆
	 * @return
	 */
	@RequestMapping(value={"/index","/","index.{anything}"},method=RequestMethod.GET)
	public String index(@ModelAttribute AccountTable accountTable,HttpSession session ){
		//若已经登陆好了,那么就不再让输入密码,直接登陆
		String account = (String) session.getAttribute("account");
		if (account != null && service.chlickSession(account) != null) {
			return "redirect:/function.html";
		}
		
		return "index";
	}

	/**
	 * function页面
	 * 验证是否有session
	 * @return
	 */
	@RequestMapping(value={"/function","/function.{anything}"},method=RequestMethod.GET)
	public String function(HttpSession session,Model model){
		
		String account = (String) session.getAttribute("account");
		AccountTable accountTable = service.chlickSession(account);
		
		if (accountTable==null || account == null) {
			return "redirect:/index";
		}
		model.addAttribute("accountTable", accountTable);
		return "function";
	}

	/**
	 * staffmanagement页面
	 * @return
	 */
	@RequestMapping(value={"/staffmanagement","/staffmanagement.{anything}"},method=RequestMethod.GET)
	public String staffmanagement(HttpSession session){
		
		int power ;
		try {
			power = (int) session.getAttribute("power");
		} catch (Exception e) {
			//差一个添加日志记录
			return "redirect:/";
		}
		 
		if (power>2) { 
			//差一个添加日志记录并且记录是谁
			return "staffmanagement";
		}
		return "redirect:/";

	}
		
	
}
