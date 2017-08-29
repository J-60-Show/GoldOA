package com.lh.GoldOA.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lh.GoldOA.domain.Leader;

public class LeaderRowMapper implements RowMapper<Leader>{

	@Override
	public Leader mapRow(ResultSet rs, int arg1) throws SQLException {
		Leader l = new Leader();
		l.setClasses(rs.getInt("classes"));
		l.setId(rs.getInt("id"));
		return l;
	}

}
