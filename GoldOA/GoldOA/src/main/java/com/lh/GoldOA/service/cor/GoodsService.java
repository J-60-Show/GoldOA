package com.lh.GoldOA.service.cor;

import com.lh.GoldOA.domain.goods.Commodity;

public interface GoodsService {

	/**
	 * 增加商品
	 * @param commodity
	 * @return 正确返回真，否则返回假
	 */
	boolean addGoods(Commodity commodity);
	
	
	/**
	 * 修改商品
	 * @param commodity
	 * @return 正确返回真，否则就返回假
	 */
	boolean changeGoods(Commodity commodity);
	
	
	
	
	
	
}
