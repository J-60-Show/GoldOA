package com.lh.GoldOA.domain.em;

import java.io.Serializable;
/**
 * 组员所属的组
 * @author NashobaBrook
 *
 */
public class Forclasses implements Serializable{

 
	   /**
	 * 
	 */
	private static final long serialVersionUID = 8864828075319447510L;
	
	private Integer eId;//员工编号
	private Integer classesId;//班组编号
	
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Integer getClassesId() {
		return classesId;
	}
	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}
	public Forclasses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
