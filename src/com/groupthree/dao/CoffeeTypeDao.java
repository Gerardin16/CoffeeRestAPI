package com.groupthree.dao;

import com.groupthree.bean.CoffeeType;
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
public class CoffeeTypeDao implements CoffeeTypeDaoInterface {

private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    @Override
    public ArrayList<CoffeeType> getCoffeeType() throws ClassNotFoundException,SQLException {
    	
		
		//For every Transaction one Session object

		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Query<CoffeeType> query = session.createQuery("from CoffeeType");
		       
		List<CoffeeType>coffeeTypes=query.getResultList();
		transaction.commit();
		session.close();
		return  (ArrayList<CoffeeType>) coffeeTypes;

    }



}

