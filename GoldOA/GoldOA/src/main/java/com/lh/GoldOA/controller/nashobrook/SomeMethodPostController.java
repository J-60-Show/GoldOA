package com.lh.GoldOA.controller.nashobrook;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.service.SystemService;

/**
 * 页面的POST请求的Controller
 * @author NashobaBrook
 * @date 2017年8月19日23:46:48 
 *
 */
@Controller
public class SomeMethodPostController {
	/**
	 * 处理的方法
	 */
	private SystemService serivce;
	
	
	@Autowired
	public void setSerivce(SystemService serivce) {
		this.serivce = serivce;
	}

	@RequestMapping(value="/out",method=RequestMethod.GET)
	public String cleanSession(HttpSession session){
		session.removeAttribute("account");
		session.removeAttribute("power");
		return "redirect:/";
	}
	


	/**
	 * 登陆的POST请求
	 * @param accountTable 账户类型
	 * @return 若登陆成功返回主页面,若登陆失败则返回响应的错误信息
	 * 未实现spring的Error在页面显示--忘了怎么玩的了(--你还是好耍)
	 */
	@RequestMapping(value={"/index","/","index.{anything}"},method=RequestMethod.POST)
	public String index(AccountTable accountTable,HttpSession session){
	
		//进行登陆
		accountTable = serivce.login(accountTable);
		if (accountTable == null) {
			return "index";
		} 
		
		//保存session
		session.setAttribute("account", accountTable.getAccount());
		session.setAttribute("power", accountTable.getPower());
		
		//到function页面
		return "redirect:/function.html";
	}
	
	
	
	
}
