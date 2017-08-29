package com.lh.GoldOA.domain;

import java.util.Date;

/**
 * 日志类
 */
public class Log {
	   
	   private String account;//账号
	   private Date time;//操作时间
	   private String work;//操作内容
	   private Integer state;// 0：正常，1：异常
	@Override
	public String toString() {
		return "Log [account=" + account + ", time=" + time + ", work=" + work + ", state=" + state + "]";
	}
	
	
	
	public Log(String account, Date time, String work, Integer state) {
		super();
		this.account = account;
		this.time = time;
		this.work = work;
		this.state = state;
	}



	public Log() {
		super();
	}



	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	   
	   
	   
	   
	   
}
