package com.lh.GoldOA.entity;

import java.util.Date;

/**
 * 员工表--持久化类
 * @author NashobaBrook
 * @data 2017年8月18日15:25:31
 *
 */
public class Employee {
    
	private Integer id;//编号
	private String name;//姓名
	private String phone;//电话号码
	private String age;//年龄
	private String address;//住址
	private String folkName;//家人姓名
	private String folkPhone;//家人电话
	private Date getDay;//到岗时间
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Date getGetDay() {
		return getDay;
	}
	public void setGetDay(Date getDay) {
		this.getDay = getDay;
	}
	public Employee() {
		super();
	}
	
	
	
	
}
