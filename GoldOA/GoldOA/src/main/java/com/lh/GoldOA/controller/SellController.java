package com.lh.GoldOA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 销售页面
 * 控制器
 */

@Controller
public class SellController {

	@RequestMapping(value="/sell",method = RequestMethod.GET)
	public String sellIndex(){
		
		return "sell";
	}
}
