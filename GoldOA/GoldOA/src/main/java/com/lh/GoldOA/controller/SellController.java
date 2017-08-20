package com.lh.GoldOA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.entity.Sell;

/**
 * 销售页面
 * 控制器
 */

@Controller
@RequestMapping("/sell")
public class SellController {

	@RequestMapping(method = RequestMethod.GET)
	public String sellIndex(ModelMap map){
		map.put("sell", new Sell());
		return "sell";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String sellIndex(ModelMap map,Sell sell){
		
		return "sell";
	}
}
