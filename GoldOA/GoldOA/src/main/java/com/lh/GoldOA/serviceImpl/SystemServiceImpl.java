package com.lh.GoldOA.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.GoldOA.common.MdFive;
import com.lh.GoldOA.dao.SystemDao;
import com.lh.GoldOA.entity.AccountTable;
import com.lh.GoldOA.entity.Sell;
import com.lh.GoldOA.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {
	 
	private SystemDao dao;
	
	@Autowired
	public void setDao(SystemDao dao) {
		this.dao = dao;
	}


	/**
	 * 登录功能(做java后台验证)
	 * @param account 账号
	 * @param password 密码
	 * @return 该用户的账号
	 */
	@Override
	public AccountTable login(AccountTable accountTable) {
		String account = accountTable.getAccount();
		String password = accountTable.getPassword();
		//若账号密码为空,那么就不让玩
		if (account.trim()==null||password.trim()==null) {
			return null;
		}
		//需要一个正则表达式先检查内容   
		
		//检查就可以了
		AccountTable accountTableOfSelect = dao.selectAccount(accountTable);
		 
		if (accountTableOfSelect!=null && accountTableOfSelect.getPassword().equals(MdFive.MD5(password.getBytes()))) {
			return accountTableOfSelect;
		}
		return null;
	}


	/**
	 * 
	 * 每个页面的Session检查
	 * @param account 账号
	 * @return 返回AccountTable.若不存在则返回NULL
	 * 可以考虑通过MD5转码 或者SHA转码保存session
	 */
	@Override
	public AccountTable chlickSession(String account) {
		AccountTable accountTable  = new AccountTable();
		accountTable.setAccount(account);
		accountTable = dao.selectAccount(accountTable);
		
		
		return accountTable;
	}
	
	
	


	/**
	 * 方法未完成，类型转换问题待处理
	 */
	@Override
	public boolean sell(Sell sell) {
		
		 dao.insertSell(sell);
		return false;
	}

}
