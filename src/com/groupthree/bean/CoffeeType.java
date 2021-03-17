package com.groupthree.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="COFFEE_TYPE")
public class CoffeeType {
	@Id
	@Column(name="COFFEE_ID")
	private int coffeeId;
	@Column(name="COFFEE_NAME")
	private String coffeeName;
	@Column(name="COFFEE_NAME_PRICE")
	private int coffeeNamePrice;
	
	public CoffeeType() {
	
	}

	public CoffeeType(int coffeeId, String coffeeName, int coffeeNamePrice) {
		super();
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.coffeeNamePrice = coffeeNamePrice;
	}




	public CoffeeType(int coffeeId) {
		super();
		this.coffeeId = coffeeId;
	}

	public int getCoffeeId() {
		return coffeeId;
	}

	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getCoffeeNamePrice() {
		return coffeeNamePrice;
	}

	public void setCoffeeNamePrice(int coffeeNamePrice) {
		this.coffeeNamePrice = coffeeNamePrice;
	}

	@Override
	public String toString() {
		return "CoffeeType [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + ", coffeeNamePrice="
				+ coffeeNamePrice + "]";
	}
	
	
	
	
	
}
