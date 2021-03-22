package com.groupthree.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.groupthree.bean.CoffeeOrder;
import com.groupthree.util.OrderDetails;



public interface BillTransactionDaoInterface {


    public void createOrder(int person,String orderNum, int selectedCoffeeType, int selectedCoffeeSize, int selectedAddon);

	public double getOrders(int person,String initialOrderNum) ;

    void createBill(int person,String initialOrderNum, int selectedVoucher, double totalBill) ;
    public List<OrderDetails> getDetailedOrders(int person, String initialOrderNum);
}
