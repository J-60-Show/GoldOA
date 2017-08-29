package com.lh.GoldOA.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lh.GoldOA.domain.Commodity;

public class CommodityRowMapper implements RowMapper<Commodity>{

	@Override
	public Commodity mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Commodity c = new Commodity();
		c.setComName(rs.getString("comName"));
		c.setId(rs.getInt("id"));
		c.setPoints(rs.getDouble("points"));
		c.setSort(rs.getInt("sort"));
		
		return c;
	}

}
