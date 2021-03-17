package com.groupthree.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="BILL_ORDER")
public class CoffeeBill {
		@Id
		@Column(name = "BILL_ID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int billId;
		@ManyToOne
		@JoinColumn(name = "P_ID")
		private PersonDetails personId;
		@Column(name = "ORDER_NUMBER")
		private String orderNumber;
		@ManyToOne
		@JoinColumn(name = "VOUCHER_ID")
		private CoffeeVoucher voucher;
		@Column(name = "TOTAL_BILL_AMT")
		private double totalAmt;
		public int getBillId() {
			return billId;
		}
		public void setBillId(int billId) {
			this.billId = billId;
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
		public CoffeeVoucher getVoucher() {
			return voucher;
		}
		public void setVoucher(CoffeeVoucher voucher) {
			this.voucher = voucher;
		}
		public double getTotalAmt() {
			return totalAmt;
		}
		public void setTotalAmt(double totalAmt) {
			this.totalAmt = totalAmt;
		}
		public CoffeeBill() {
			
		}
	
	
		public CoffeeBill(String orderNumber, double totalAmt) {
			super();
			this.orderNumber = orderNumber;
			this.totalAmt = totalAmt;
		}
		@Override
		public String toString() {
			return "CoffeeBill [billId=" + billId + ", personId=" + personId + ", orderNumber=" + orderNumber
					+ ", voucher=" + voucher + ", totalAmt=" + totalAmt + "]";
		}

		

}
