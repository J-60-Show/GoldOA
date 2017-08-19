package com.lh.GoldOA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.entity.AccountTable;

/**
 * 登陆页面的POST请求的Controller
 * @author Administrator
 *
 */
@Controller
public class SomeForMethodPostController {
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value={"/index"},method=RequestMethod.POST)
	public String index(AccountTable accountTable){
		
		return null;
	}
}
