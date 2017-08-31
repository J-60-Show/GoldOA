package com.lh.GoldOA.controller.cor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String addGoods(){	
		return "addGoods";
	}
}
