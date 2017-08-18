package com.lh.GoldOA.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.lh.GoldOA.entity.AccountTable;

public class AccountTableRowMapper implements RowMapper<AccountTable>{

	@Override
	public AccountTable mapRow(ResultSet rs, int arg1) throws SQLException {
		
		AccountTable a = new AccountTable();
		
		a.setAccount(rs.getString("account"));
		a.setId(rs.getInt("id"));
		a.setPassword(rs.getString("password"));
		a.setPower(rs.getInt("power"));
		
		return a;
	}

}
