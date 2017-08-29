package com.lh.GoldOA.daoImpl;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lh.GoldOA.dao.SystemDao;
import com.lh.GoldOA.domain.AccountTable;
import com.lh.GoldOA.domain.Employee;
import com.lh.GoldOA.domain.Sell;
import com.lh.GoldOA.rowmapper.AccountTableRowMapper;

/**
 * systemDao的实现类
 * @author NashobaBrook
 * @date 2017年8月18日16:20:30
 *
 */
@Service
@Repository
public class SystemDaoImpl implements SystemDao{

	@Autowired
	JdbcTemplate jdbc;
	

	/**
	 * 查找该账号密码对应的
	 * @return 返回查找到的用户:若未查询到就返回null;
	 */ 
	@Override
	public AccountTable selectAccount(AccountTable accountTable) {
		String account = accountTable.getAccount(); 
		String sql="select * from accountTable where account = ?";
		List<AccountTable> list = jdbc.query(sql,new AccountTableRowMapper() ,account);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}


	/**
	 * 增加销售单方法，返回受影响的行数
	 */
	@Override
	public int insertSell(Sell sell) {
		
		String sql = "insert into sell value(default,?,?,?,?,?)";
		
		return jdbc.update(sql,sell.getEmployeeId(),sell.getSellComId(),
					sell.getClass(),sell.getOrderTime(),sell.getSellTime());
	}


	@Override
	public List<Employee> SecletEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
