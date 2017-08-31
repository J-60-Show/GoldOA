package com.lh.GoldOA.controller.nashobrook;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lh.GoldOA.domain.em.AccountTable;
import com.lh.GoldOA.domain.em.Employee;

@Controller
public class AjaxController {
	/**ajax请求添加员工*/
	@RequestMapping(value={"/add","/add.html","/add.{anything}"},method=RequestMethod.POST)
	@ResponseBody
	public Object add(Employee employee,AccountTable accountTable){
		Map<String, Object> map = new HashMap<>();
		
		return map;
	}
	
}
