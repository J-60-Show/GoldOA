package com.lh.GoldOA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lh.GoldOA.domain.goods.Sell;
import com.lh.GoldOA.service.SystemService;

/**
 * 销售页面
 * 控制器
 */

@Controller
@RequestMapping("/sell")
public class SellController {
	
	@Autowired
	SystemService systemService;

	@RequestMapping(method = RequestMethod.GET)
	public String sellIndex(ModelMap map ){
		
		
		map.put("sell", new Sell());
		return "sell";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String sellIndex(ModelMap map,Sell sell){
		
		boolean result = systemService.sell(sell);
		
		if(result == true){
			return "/sell";
		}
		
		return "sell";
	}
	
}
