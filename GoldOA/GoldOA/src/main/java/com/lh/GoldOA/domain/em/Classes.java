package com.lh.GoldOA.domain.em;

import java.io.Serializable;

/**
 * 班组表
 * 
 * @author NashobaBrook
 * @date 2017年8月31日10:41:11
 */
public class Classes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3850530067763889411L;

	private Integer classesId;// 班组编号
	private String calssesName;// 班组名称
	private Integer leaderId;// 组长编号

	public Integer getClassesId() {
		return classesId;
	}

	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}

	public String getCalssesName() {
		return calssesName;
	}

	public void setCalssesName(String calssesName) {
		this.calssesName = calssesName;
	}

	public Integer getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(Integer leaderId) {
		this.leaderId = leaderId;
	}

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

}
