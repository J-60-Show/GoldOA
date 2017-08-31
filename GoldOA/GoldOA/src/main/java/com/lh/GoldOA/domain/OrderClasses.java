package com.lh.GoldOA.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 排班表
 * @author NashobaBrook
 * @date 2017年8月31日10:39:06
 */
public class OrderClasses implements Serializable{
 
	   
	   /**
	 * 
	 */
	private static final long serialVersionUID = -1145454270451948264L;
	private Integer id;//编号
	   private Date 	orderTime;//时间
	   private Integer classesId;//班组编号
	   private Integer eId;//员工编号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getClassesId() {
		return classesId;
	}
	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public OrderClasses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	   
	   
}
