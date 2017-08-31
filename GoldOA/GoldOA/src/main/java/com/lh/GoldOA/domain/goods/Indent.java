package com.lh.GoldOA.domain.goods;

import java.io.Serializable;
import java.util.Date;
/**
 * 订单表
 * @author NashobaBrook
 * @date 2017年8月31日10:39:37
 */
public class Indent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4272701961842899304L; 
	   private Integer id;//订单编号
	   private Integer indentEId;//订单人编号
	   private Integer sellEid;//销售人员标号
	   private Date 	beginTime;//开始时间
	   private Date endTime;//结束时间
	   private Integer beginClassesId;//开始班组
	   private Integer endClassesId;//结束班组
	   private Integer sellComId ;//销售商品编号
	   private Integer price;//销售价格(注:单价应该用double)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIndentEId() {
		return indentEId;
	}
	public void setIndentEId(Integer indentEId) {
		this.indentEId = indentEId;
	}
	public Integer getSellEid() {
		return sellEid;
	}
	public void setSellEid(Integer sellEid) {
		this.sellEid = sellEid;
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
	public Integer getBeginClassesId() {
		return beginClassesId;
	}
	public void setBeginClassesId(Integer beginClassesId) {
		this.beginClassesId = beginClassesId;
	}
	public Integer getEndClassesId() {
		return endClassesId;
	}
	public void setEndClassesId(Integer endClassesId) {
		this.endClassesId = endClassesId;
	}
	public Integer getSellComId() {
		return sellComId;
	}
	public void setSellComId(Integer sellComId) {
		this.sellComId = sellComId;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Indent() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	   
	
	
	

}
