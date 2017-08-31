package com.lh.GoldOA.domain;

import java.util.Date;
/**
 * 工资表
 * @author NashobaBrook
 * @date 2017年8月31日10:37:29
 */
public class Salary {
	   
	   private Integer eId;//员工编号
	   private Date  beginTime;//开始时间
	   private Date endTime;//结束时间
	   private Integer money ;//提成
	   private Integer state;//状态(0:已发，1：未发)
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
}
