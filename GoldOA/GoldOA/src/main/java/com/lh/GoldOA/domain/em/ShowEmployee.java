package com.lh.GoldOA.domain.em;

import java.io.Serializable;

public class ShowEmployee implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7081357451333062583L;

	private Integer id;// 编号

	private String account;// 账号
	
	private String name;//姓名
	
	private String phone;//电话
	
	private String age;//年龄
	
	private String address;//住址
	
	private String folkName;//亲属姓名
	
	private String folkPhone;//亲属电话

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

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFolkName() {
		return folkName;
	}

	public void setFolkName(String folkName) {
		this.folkName = folkName;
	}

	public String getFolkPhone() {
		return folkPhone;
	}

	public void setFolkPhone(String folkPhone) {
		this.folkPhone = folkPhone;
	}

	public ShowEmployee() {
		super(); 
	}
	
	
	
}
