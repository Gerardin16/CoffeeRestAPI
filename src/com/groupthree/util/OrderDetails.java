package com.groupthree.util;

public class OrderDetails {
	
	
	private String ordCoffeeType;
	private String ordCoffeeSize;
	private String ordCoffeeAddon;
	
	
	public String getOrdCoffeeType() {
		return ordCoffeeType;
	}
	public void setOrdCoffeeType(String ordCoffeeType) {
		this.ordCoffeeType = ordCoffeeType;
	}
	public String getOrdCoffeeSize() {
		return ordCoffeeSize;
	}
	public void setOrdCoffeeSize(String ordCoffeeSize) {
		this.ordCoffeeSize = ordCoffeeSize;
	}
	public String getOrdCoffeeAddon() {
		return ordCoffeeAddon;
	}
	public void setOrdCoffeeAddon(String ordCoffeeAddon) {
		this.ordCoffeeAddon = ordCoffeeAddon;
	}
	public OrderDetails(String ordCoffeeType, String ordCoffeeSize, String ordCoffeeAddon) {
		super();
		this.ordCoffeeType = ordCoffeeType;
		this.ordCoffeeSize = ordCoffeeSize;
		this.ordCoffeeAddon = ordCoffeeAddon;
	}
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderDetails [ordCoffeeType=" + ordCoffeeType + ", ordCoffeeSize=" + ordCoffeeSize + ", ordCoffeeAddon="
				+ ordCoffeeAddon + "]";
	}
	

}
