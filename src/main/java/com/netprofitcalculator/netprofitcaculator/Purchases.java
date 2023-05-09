package com.netprofitcalculator.netprofitcaculator;
 
public class Purchases {
	private String name;
	private String email;
	private String country;
    private String CardName;
    private Double CardCost;
    private Double CardPrice;
    private Integer CardQuantity;
    private Double CardShipping;

	public Purchases() {
		super();
	}

	public Purchases(String CardName, Double CardCost, Double CardPrice, Integer CardQuantity, Double CardShipping) {
		super();
		this.CardName = CardName;
		this.CardCost = CardCost;
		this.CardPrice = CardPrice;
        this.CardQuantity = CardQuantity;
        this.CardShipping = CardShipping;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

    public String getCardName(){
        return CardName;
    }

    public void setCardName(String CardName){
        this.CardName = CardName;
    }

    public Double getCardCost(){
        return CardCost;
    }

    public void setCardCost(Double CardCost){
        this.CardCost = CardCost;
    }

    public Double getCardPrice(){
        return CardPrice;
    }

    public void setCardPrice(Double CardPrice){
        this.CardPrice = CardPrice;
    }

    public Integer getCardQuantity(){
        return CardQuantity;
    }

    public void setCardQuantity(Integer CardQuantity){
        this.CardQuantity = CardQuantity;
    }    

    public Double getCardShipping(){
        return CardShipping;
    }

    public void setCardShipping(Double CardShipping){
        this.CardShipping = CardShipping;
    }
}
