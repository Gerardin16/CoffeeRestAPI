package com.groupthree.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="VOUCHER")
public class CoffeeVoucher {
	
	@Id
	@Column(name="VOUCHER_ID")
	private int voucherId;
	@Column(name="VOUCHER_CODE")
	private String voucherCode;
	@Column(name="VOUCHER_DESCRIPTION")
	private String voucherDescription;
	
	public CoffeeVoucher() {
		
	}

	public CoffeeVoucher(int voucherId, String voucherCode, String voucherDescription) {
		super();
		this.voucherId = voucherId;
		this.voucherCode = voucherCode;
		this.voucherDescription = voucherDescription;
	}
	
	

	public CoffeeVoucher(int voucherId) {
		super();
		this.voucherId = voucherId;
	}

	public int getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(int voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherDescription() {
		return voucherDescription;
	}

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	@Override
	public String toString() {
		return "Voucher [voucherId=" + voucherId + ", voucherCode=" + voucherCode + ", voucherDescription="
				+ voucherDescription + "]";
	}
	
	
	
}
