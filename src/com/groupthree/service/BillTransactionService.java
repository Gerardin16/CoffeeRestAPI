package com.groupthree.service;

import com.groupthree.bean.CoffeeBill;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupthree.bean.CoffeeVoucher;
import com.groupthree.dao.BillTransactionDao;
import com.groupthree.dao.BillTransactionDaoInterface;
import com.groupthree.dao.CoffeeVoucherDao;
import com.groupthree.dao.CoffeeVoucherDaoInterface;
import com.groupthree.util.BeverageHelper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
@Service
public class BillTransactionService implements BillTransactionServiceInterface{
	@Autowired
    private BillTransactionDaoInterface billTrans;
	@Autowired
	CoffeeVoucherDaoInterface coffeeVoucher;
	
	public BillTransactionDaoInterface getBillTrans() {
		return billTrans;
	}


	public void setBillTrans(BillTransactionDaoInterface billTrans) {
		this.billTrans = billTrans;
	}


	public CoffeeVoucherDaoInterface getCoffeeVoucher() {
		return coffeeVoucher;
	}

	public void setCoffeeVoucher(CoffeeVoucherDaoInterface coffeeVoucher) {
		this.coffeeVoucher = coffeeVoucher;
	}

	private Integer totalValue;


    @Override
    public ArrayList  generateBill(int person,String initialOrderNum, int selectedVoucher)
			throws ClassNotFoundException, SQLException {
    	double totalValue=0;
    	double discount = 0;
    	double netValue;
    	double gstTax;
    	double stTax;
    	double totalBill;
		ArrayList displayBill=new ArrayList();
		
		ArrayList<CoffeeVoucher> coffeeVoucherList=coffeeVoucher.getCoffeeVoucher();
    	totalValue= billTrans.getOrders(person,initialOrderNum);
    
			if(selectedVoucher==0)
				discount=0.0;
			else
			{
				for(CoffeeVoucher voucher:coffeeVoucherList)
				{
			if(selectedVoucher==voucher.getVoucherId())
			{
				if(voucher.getVoucherCode().toString().equalsIgnoreCase("BZH30"))
					discount=0.3*totalValue;
				if(voucher.getVoucherCode().toString().equalsIgnoreCase("BZH20"))
					discount=0.2*totalValue;
				if(voucher.getVoucherCode().toString().equalsIgnoreCase("BZH20"))
					discount=0.1*totalValue;
			}
			}
				
		}
		netValue=totalValue-discount;
		gstTax=netValue*GST_TAX;
		gstTax=Math.round(gstTax);
		stTax=netValue*SERVICE_TAX;
		stTax=Math.round(stTax);
		totalBill=netValue+gstTax+stTax;
		totalBill=Math.round(totalBill);
		billTrans.createBill(person,initialOrderNum,selectedVoucher,totalBill);
		displayBill.add( Double.valueOf(totalValue));
		displayBill.add (discount);
		displayBill.add( netValue);
		displayBill.add( gstTax);
		displayBill.add( stTax);
		displayBill.add(totalBill);

		return  displayBill;
	}




	@Override
	public String createRandomOrderNumber() {
	
		String rand=UUID.randomUUID().toString().replace("-", "");
		rand=ORDER_NUMBER+rand.substring(0,3);
		return rand;
	}






	@Override
	public void createCoffeeOrder(int person, String orderNum, int selectedCoffeeType, int selectedCoffeeSize,
			int selectedAddon) throws ClassNotFoundException, SQLException {
		billTrans.createOrder(person,orderNum,selectedCoffeeType,selectedCoffeeSize,selectedAddon);
		
	}







	



}
