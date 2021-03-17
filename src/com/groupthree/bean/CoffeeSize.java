package com.groupthree.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="COFFEE_SIZE")
public class CoffeeSize {
	    @Id
	    @Column(name="COFFEE_SIZE_ID")
		private int coffeeSizeId;
	    @Column(name="COFFEE_SIZE")
		private String coffeeSizeName;
	    @Column(name="COFFEE_SIZE_PRICE")
		private int coffeeSizePrice;
		
		

		public CoffeeSize() {
			
		}

		public CoffeeSize(int coffeeSizeId) {
			super();
			this.coffeeSizeId = coffeeSizeId;
		}

		public CoffeeSize(int coffeeSizeId, String coffeeSizeName, int coffeeSizePrice) {
			super();
			this.coffeeSizeId = coffeeSizeId;
			this.coffeeSizeName = coffeeSizeName;
			this.coffeeSizePrice = coffeeSizePrice;
		}

		public int getCoffeeSizeId() {
			return coffeeSizeId;
		}

		public void setCoffeeSizeId(int coffeeSizeId) {
			this.coffeeSizeId = coffeeSizeId;
		}

		public String getCoffeeSizeName() {
			return coffeeSizeName;
		}

		public void setCoffeeSizeName(String coffeeSizeName) {
			this.coffeeSizeName = coffeeSizeName;
		}

		public int getCoffeeSizePrice() {
			return coffeeSizePrice;
		}

		public void setCoffeeSizePrice(int coffeeSizePrice) {
			this.coffeeSizePrice = coffeeSizePrice;
		}

		@Override
		public String toString() {
			return "CoffeeSize [coffeeSizeId=" + coffeeSizeId + ", coffeeSizeName=" + coffeeSizeName
					+ ", coffeeSizePrice=" + coffeeSizePrice + "]";
		}
		
		
		
		
}
