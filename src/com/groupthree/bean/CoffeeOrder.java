package com.groupthree.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="COFFEE_ORDER")
public class CoffeeOrder {
		@Id
		@Column(name = "ORDER_ID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int orderId;
		@ManyToOne
		@JoinColumn(name = "P_ID")
		private PersonDetails personId;
		@Column(name = "ORDER_NUMBER")
		private String orderNumber;
		@ManyToOne
		@JoinColumn(name = "COFFEE_ID")
		private CoffeeType coffeeId;
		@ManyToOne
		@JoinColumn(name = "COFFEE_SIZE_ID")
		private CoffeeSize coffeeSizeId;
		@ManyToOne
		@JoinColumn(name = "COFFEE_ADDON_ID")
		private CoffeeAddon coffeeAddonId;





	public CoffeeOrder() {

	}


	public int getOrderId() {
		return orderId;
	}





	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}





	public PersonDetails getPersonId() {
		return personId;
	}





	public void setPersonId(PersonDetails personId) {
		this.personId = personId;
	}





	public String getOrderNumber() {
		return orderNumber;
	}





	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}





	public CoffeeType getCoffeeId() {
		return coffeeId;
	}





	public void setCoffeeId(CoffeeType coffeeId) {
		this.coffeeId = coffeeId;
	}





	public CoffeeSize getCoffeeSizeId() {
		return coffeeSizeId;
	}





	public void setCoffeeSizeId(CoffeeSize coffeeSizeId) {
		this.coffeeSizeId = coffeeSizeId;
	}





	public CoffeeAddon getCoffeeAddonId() {
		return coffeeAddonId;
	}





	public void setCoffeeAddonId(CoffeeAddon coffeeAddonId) {
		this.coffeeAddonId = coffeeAddonId;
	}





	public CoffeeOrder(String orderNumber) {
		super();
		this.orderNumber = orderNumber;
	}








	




	@Override
	public String toString() {
		return "CoffeeOrder [orderId=" + orderId + ", personId=" + personId + ", orderNumber=" + orderNumber
				+ ", coffeeId=" + coffeeId + ", coffeeSizeId=" + coffeeSizeId + ", coffeeAddonId=" + coffeeAddonId
				+ "]";
	}


	public CoffeeOrder(PersonDetails personId, String orderNumber) {
		super();
		this.personId = personId;
		this.orderNumber = orderNumber;
	}


	
	
}
