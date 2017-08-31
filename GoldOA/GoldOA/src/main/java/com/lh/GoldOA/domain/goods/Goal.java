package com.lh.GoldOA.domain.goods;

import java.io.Serializable;
import java.util.Date;

/**
 * 目标表
 * 
 * @author NashobaBrook
 * @date 2017年8月31日10:40:06
 */
public class Goal implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -8983934878799196185L;
	private Integer eid;// 员工编号
	private Date goalTime;// 目标日期
	private Integer goalPerfor;// 目标业绩

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Date getGoalTime() {
		return goalTime;
	}

	public void setGoalTime(Date goalTime) {
		this.goalTime = goalTime;
	}

	public Integer getGoalPerfor() {
		return goalPerfor;
	}

	public void setGoalPerfor(Integer goalPerfor) {
		this.goalPerfor = goalPerfor;
	}

	public Goal() {
		super();
		// TODO Auto-generated constructor stub
	}

}
