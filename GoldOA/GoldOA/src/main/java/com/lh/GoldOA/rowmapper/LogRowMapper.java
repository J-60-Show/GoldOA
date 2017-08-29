package com.lh.GoldOA.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lh.GoldOA.domain.Log;

public class LogRowMapper implements RowMapper<Log>{

	@Override
	public Log mapRow(ResultSet rs, int arg1) throws SQLException {
		Log log = new Log();
		log.setAccount(rs.getString("account"));
		log.setState(rs.getInt("state"));
		log.setTime(rs.getDate("time"));
		return log;
	}

}
