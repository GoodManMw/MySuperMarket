package com.mysupermarket.gooddata.service;

import java.util.Map;

import com.mysupermarket.gooddata.controller.ao.DataToAddToBuyCarEntity;
import com.mysupermarket.pojo.GoodBuycar;

public interface AddDataToBuyCarService {

	public Map<String, String> PostDataToBuyCar(DataToAddToBuyCarEntity data, int useraccount);
	
	public GoodBuycar CheckISExist(int goodId, int buycarId, String goodChoose);
	
}
