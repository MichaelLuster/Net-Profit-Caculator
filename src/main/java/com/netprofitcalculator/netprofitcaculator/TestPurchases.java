package com.netprofitcalculator.netprofitcaculator;

import java.util.ArrayList;
import java.util.List;

public class TestPurchases {
	public List<Purchases> getPurchaseList() {
		List<Purchases> listPurchase = new ArrayList<>();
		
		listPurchase.add(new Purchases("Blue Eyes White Dragon", 0.25, 1.00, 1, 0.99));
		listPurchase.add(new Purchases("Red Eyes Black Dragon", 0.10, 0.75, 2, 0.00));
		listPurchase.add(new Purchases("Dark Magician", 0.50, 1.09, 4, 0.00));
		
		return listPurchase;
	}
}
