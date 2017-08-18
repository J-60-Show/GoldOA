package com.lh.GoldOA.entity;

/**
 * 日志类
 */
public class Log {
	   
	   private String account;//账号
	   private String time;//操作时间
	   private String work;//操作内容
	   private Integer state;// 0：正常，1：异常
	   
	   
	   
	   
	public Log(String account, String time, String work, Integer state) {
		super();
		this.account = account;
		this.time = time;
		this.work = work;
		this.state = state;
	}
	
	
	public Log() {
		super();
	}
	
	


	@Override
	public String toString() {
		return "Log [account=" + account + ", time=" + time + ", work=" + work + ", state=" + state + "]";
	}


	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
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
