package com.groupthree.dao;

import com.groupthree.bean.CoffeeType
;
import com.groupthree.bean.CoffeeVoucher;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CoffeeVoucherDao implements CoffeeVoucherDaoInterface{

private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    @Override
    public ArrayList<CoffeeVoucher> getCoffeeVoucher() throws ClassNotFoundException,SQLException {

		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		Query<CoffeeVoucher> query = session.createQuery("from CoffeeVoucher where voucherCode <> 'DUMMY'");
		       
		List<CoffeeVoucher> coffeeVouchers=query.getResultList();
		transaction.commit();
		session.close();
		return  (ArrayList<CoffeeVoucher>) coffeeVouchers;


    }
}
