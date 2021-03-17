package com.groupthree.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="COFFEE_ADDONS")
public class CoffeeAddon {
	
	@Id
	@Column(name="COFFEE_ADDON_ID")
	private int coffeeAddonId;
	@Column(name="COFFEE_ADDON_NAME")
	private String coffeeAddonName;
	@Column(name="COFFEE_ADDON_PRICE")
	private int coffeeAddonPrice;
	
	

	public CoffeeAddon() {
		
	}

	public CoffeeAddon(int coffeeAddonId) {
		super();
		this.coffeeAddonId = coffeeAddonId;
	}

	public CoffeeAddon(int coffeeAddonId, String coffeeAddonName, int coffeeAddonPrice) {
		super();
		this.coffeeAddonId = coffeeAddonId;
		this.coffeeAddonName = coffeeAddonName;
		this.coffeeAddonPrice = coffeeAddonPrice;
	}

	public int getCoffeeAddonId() {
		return coffeeAddonId;
	}

	public void setCoffeeAddonId(int coffeeAddonId) {
		this.coffeeAddonId = coffeeAddonId;
	}

	public String getCoffeeAddonName() {
		return coffeeAddonName;
	}

	public void setCoffeeAddonName(String coffeeAddonName) {
		this.coffeeAddonName = coffeeAddonName;
	}

	public int getCoffeeAddonPrice() {
		return coffeeAddonPrice;
	}

	public void setCoffeeAddonPrice(int coffeeAddonPrice) {
		this.coffeeAddonPrice = coffeeAddonPrice;
	}

	@Override
	public String toString() {
		return "CoffeeAddon [coffeeAddonId=" + coffeeAddonId + ", coffeeAddonName=" + coffeeAddonName
				+ ", coffeeAddonPrice=" + coffeeAddonPrice + "]";
	}
	
	

}
