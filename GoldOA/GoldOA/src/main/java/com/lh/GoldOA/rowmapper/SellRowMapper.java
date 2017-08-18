package com.lh.GoldOA.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lh.GoldOA.entity.Sell;

public class SellRowMapper implements RowMapper<Sell>{

	@Override
	public Sell mapRow(ResultSet rs, int arg1) throws SQLException {
			
			Sell s = new Sell();
			s.setClasses(rs.getInt("classes"));
			s.setEmployeeId(rs.getInt("employeeId"));
			s.setId(rs.getInt("id"));
			s.setOrderTime(rs.getDate("orderTime"));
			s.setSellComId(rs.getInt("sellComId"));
			s.setSellTime(rs.getDate("sellTime"));
		
			return s;
	}

}
