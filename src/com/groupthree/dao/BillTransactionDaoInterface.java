package com.groupthree.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupthree.bean.CoffeeOrder;



public interface BillTransactionDaoInterface {


    public void createOrder(int person,String orderNum, int selectedCoffeeType, int selectedCoffeeSize, int selectedAddon) throws ClassNotFoundException, SQLException;

	public double getOrders(int person,String initialOrderNum) throws SQLException, ClassNotFoundException;

    void createBill(int person,String initialOrderNum, int selectedVoucher, double totalBill) throws SQLException, ClassNotFoundException;
}
