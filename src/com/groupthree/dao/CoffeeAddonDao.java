package com.groupthree.dao;

import com.groupthree.bean.CoffeeAddon;
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
public class CoffeeAddonDao implements CoffeeAddonDaoInterface{
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


    @Override
    public ArrayList<CoffeeAddon> getCoffeeAddon() throws ClassNotFoundException, SQLException {
    	
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		Query<CoffeeAddon> query = session.createQuery("from CoffeeAddon where coffeeAddonName<>'DUMMY'");
		       
		List<CoffeeAddon> coffeeAddons=query.getResultList();
		transaction.commit();
		session.close();
		return  (ArrayList<CoffeeAddon>) coffeeAddons;

    }
}

