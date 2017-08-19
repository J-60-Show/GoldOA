package com.lh.GoldOA.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.GoldOA.dao.SystemDao;
import com.lh.GoldOA.entity.AccountTable;
import com.lh.GoldOA.service.SystemService;
@Service
public class SystemServiceImpl implements SystemService {
	
	@SuppressWarnings("unused")
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
		accountTable = dao.selectAccount(accountTable);
		
		
		return accountTable;
	}

}
