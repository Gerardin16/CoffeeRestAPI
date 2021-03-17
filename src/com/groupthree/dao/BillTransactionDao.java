package com.groupthree.dao;


import com.groupthree.bean.CoffeeAddon;

import com.groupthree.bean.CoffeeBill;
import com.groupthree.bean.CoffeeOrder;
import com.groupthree.bean.CoffeeSize;
import com.groupthree.bean.CoffeeType;
import com.groupthree.bean.CoffeeVoucher;
import com.groupthree.bean.PersonDetails;
import java.sql.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BillTransactionDao implements BillTransactionDaoInterface {

    private static final int NULL = 0;
    private SessionFactory sessionFactory;
    
    
  
    @Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
    public void createOrder(int person,String orderNum, int selectedCoffeeType, int selectedCoffeeSize, int selectedAddon)
            throws ClassNotFoundException, SQLException {
        
       
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		CoffeeOrder coffeeOrder=new CoffeeOrder(orderNum);
		PersonDetails per=new PersonDetails(person);
		CoffeeType ct=new CoffeeType(selectedCoffeeType);
		CoffeeSize cs=new CoffeeSize(selectedCoffeeSize);
		CoffeeAddon ca=new CoffeeAddon(selectedAddon);
		
		coffeeOrder.setPersonId(per);
		coffeeOrder.setCoffeeId(ct);
		coffeeOrder.setCoffeeSizeId(cs);
		coffeeOrder.setCoffeeAddonId(ca);
		
		session.save(coffeeOrder);
		transaction.commit();
		session.close();
		
    }

	@Override
	public double getOrders(int person,String initialOrderNum) throws SQLException, ClassNotFoundException {
		 double totalSum=0.0;
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		Query query = session.createQuery("SELECT SUM(ct.coffeeNamePrice+cs.coffeeSizePrice+ca.coffeeAddonPrice) as TOTAL_SUM  from CoffeeOrder co inner join CoffeeType ct"
								+" on co.coffeeId=ct.coffeeId inner join CoffeeSize cs on co.coffeeSizeId=cs.coffeeSizeId"
								+" inner join CoffeeAddon ca on co.coffeeAddonId=ca.coffeeAddonId where P_ID=:per and ORDER_NUMBER=:ord" );
		query.setParameter("per", person) ;    
		query.setParameter("ord", initialOrderNum) ;
		long result=(long) query.getSingleResult();
		totalSum=(double) result;
		transaction.commit();
		session.close();
		return   totalSum;
	}

	@Override
	public void createBill(int person,String initialOrderNum, int selectedVoucher, double totalBill) throws SQLException, ClassNotFoundException {
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		CoffeeBill coffeeBill=new CoffeeBill(initialOrderNum,totalBill);
		
		PersonDetails per=new PersonDetails(person);
	
		CoffeeVoucher cvou=new CoffeeVoucher(selectedVoucher);
		
		coffeeBill.setPersonId(per);
		coffeeBill.setVoucher(cvou);
		
		session.save(coffeeBill);
		transaction.commit();
		session.close();
		
	}


}
