package com.groupthree.service;

import com.groupthree.bean.CoffeeBill;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

public interface BillTransactionServiceInterface {

    double GST_TAX=0.18;
    double SERVICE_TAX=0.18;
    String ORDER_NUMBER="ORDR";

    public ArrayList generateBill(int person,String initialOrderNum, int selectedVoucher)throws ClassNotFoundException,SQLException;

    public String createRandomOrderNumber();

   
	public void createCoffeeOrder(int person, String orderNum, int selectedCoffeeType, int selectedCoffeeSize,
			int selectedAddon) throws ClassNotFoundException, SQLException;


}
