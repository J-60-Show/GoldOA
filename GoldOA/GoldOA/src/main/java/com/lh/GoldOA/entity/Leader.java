package com.lh.GoldOA.entity;

/**
 * 组长类
 */
public class Leader {

		/**
		 * 班组组次 
		 * 0：A组，
		 * 1：B组
		 */
	   private Integer classes;
	   /**
	    * 组长编号
	    */
	   private Integer id;
	   
	   
	public Leader(Integer classes, Integer id) {
		super();
		this.classes = classes;
		this.id = id;
	}
	
	
	public Leader() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Leader [classes=" + classes + ", id=" + id + "]";
	}


	public Integer getClasses() {
		return classes;
	}
	public void setClasses(Integer classes) {
		this.classes = classes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	   
	   
}
