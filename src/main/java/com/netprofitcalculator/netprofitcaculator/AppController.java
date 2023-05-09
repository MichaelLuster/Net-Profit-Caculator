package com.netprofitcalculator.netprofitcaculator;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	
	@RequestMapping("/Net_Profit")
	public String listPurchase(Model model) {
		
		TestPurchases NetProfit = new TestPurchases();
		List<Purchases> purchaseList = NetProfit.getPurchaseList();

		model.addAttribute("purchases", new Purchases());
		model.addAttribute("purchases", purchaseList);		
		

		return "Net_Profit";
	}
    
    @PostMapping("/Net_Profit")
    public String NetProfitSubmit(@ModelAttribute Purchases purchase, Model model) {
		
		model.addAttribute("purchase", purchase);		
		
		return "Result";
    }

}
