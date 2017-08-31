package com.lh.GoldOA.domain.goods;

import java.util.Date;

/**
 * 目标达成提成
 * 
 * @author NashoboBrook
 * @dete 2017年8月31日10:37:56
 */
public class OverGoal {

	private Date golaTime;// 目标日期
	private Integer goodsId;// 商品种类编号
	private Double overPoints;// 达成后提成点子

	public Date getGolaTime() {
		return golaTime;
	}

	public void setGolaTime(Date golaTime) {
		this.golaTime = golaTime;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Double getOverPoints() {
		return overPoints;
	}

	public void setOverPoints(Double overPoints) {
		this.overPoints = overPoints;
	}

	public OverGoal() {
		super();
		// TODO Auto-generated constructor stub
	}

}
