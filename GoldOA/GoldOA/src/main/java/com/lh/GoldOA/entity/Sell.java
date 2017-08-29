package com.lh.GoldOA.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 销售类
 */
public class Sell implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1269130101031805550L;
	private Integer employeeId;// 编号
	private Integer id;// 销售表编号
	private Integer sellComId;// 商品种类编号
	private Integer classes;// 班组 0：A组，1：B组
	private Date orderTime;// 订单时间
	private Date sellTime;// 销售时间
	
	
	
	
	
	public Sell(Integer employeeId, Integer id, Integer sellComId, Integer classes, Date orderTime, Date sellTime) {
		super();
		this.employeeId = employeeId;
		this.id = id;
		this.sellComId = sellComId;
		this.classes = classes;
		this.orderTime = orderTime;
		this.sellTime = sellTime;
	}
	
	
	
	public Sell() {
		super();
	}
	
	



	@Override
	public String toString() {
		return "Sell [employeeId=" + employeeId + ", id=" + id + ", sellComId=" + sellComId + ", classes=" + classes
				+ ", orderTime=" + orderTime + ", sellTime=" + sellTime + "]";
	}



	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSellComId() {
		return sellComId;
	}
	public void setSellComId(Integer sellComId) {
		this.sellComId = sellComId;
	}
	public Integer getClasses() {
		return classes;
	}
	public void setClasses(Integer classes) {
		this.classes = classes;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getSellTime() {
		return sellTime;
	}
	public void setSellTime(Date sellTime) {
		this.sellTime = sellTime;
	}
	
	
	
}
