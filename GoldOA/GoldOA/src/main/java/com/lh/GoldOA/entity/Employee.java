package com.lh.GoldOA.entity;

import java.util.Date;

/**
 * Ա����--�־û���
 * @author NashobaBrook
 * @data 2017��8��18��15:25:31
 *
 */
public class Employee {
    
	private Integer id;//���
	private String name;//����
	private String phone;//�绰����
	private String age;//����
	private String address;//סַ
	private String folkName;//��������
	private String folkPhone;//���˵绰
	private Date getDay;//����ʱ��
	
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
