package com.lh.GoldOA.service.nashoba;

import java.util.Map;
 
import com.lh.GoldOA.domain.Employee;

public interface Service {
	/**想数据库添加员工数据*/
	public Map<String, Object> add(Employee employee);
	
	
}
