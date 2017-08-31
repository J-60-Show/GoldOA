package com.lh.GoldOA.domain.em;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 账号--持久化类
 * 
 * @author NashobaBrook
 * @date 2017年8月18日15:45:34
 *
 */
public class AccountTable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5935690988275722191L;

	private Integer id;// 编号

	private String account;// 账号

	@NotEmpty(message = "密码不能为空")
	private String password;// 密码

	private int power;// 权限

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public AccountTable() {
		super();
	}

}
