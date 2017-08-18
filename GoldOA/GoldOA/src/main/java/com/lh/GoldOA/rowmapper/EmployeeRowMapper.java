package com.lh.GoldOA.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lh.GoldOA.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e = new Employee();
		e.setAddress(rs.getString("address"));
		e.setAge(rs.getString("age"));
		e.setFolkName(rs.getString("folkName"));
		e.setFolkPhone(rs.getString("folkPhone"));
		e.setGetDay(rs.getDate("getDay"));
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setPhone(rs.getString("phone"));
		return e;
	}

}
