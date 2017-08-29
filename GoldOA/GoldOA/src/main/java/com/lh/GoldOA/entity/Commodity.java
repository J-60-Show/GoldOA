package com.lh.GoldOA.entity;

import java.io.Serializable;

/**
 * 商品表--持久化类
 * @author NashobaBrook
 * @date 2017年8月18日15:48:11
 *
 */
public class Commodity implements Serializable{
	   
	   /**
	 * 
	 */
	private static final long serialVersionUID = -658419152138972929L;
	private Integer id;//商品编号
	   private String comName;//商品名称
	   private Double points;//提成点
	   private Integer sort;//大分类 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Double getPoints() {
		return points;
	}
	public void setPoints(Double points) {
		this.points = points;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Commodity() {
		super();
	}
	   
	   
	   
}
