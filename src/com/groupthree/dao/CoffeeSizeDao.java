package com.groupthree.dao;

import com.groupthree.bean.CoffeeSize;
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
public class CoffeeSizeDao implements CoffeeSizeDaoInterface {
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


    @Override
    public ArrayList<CoffeeSize> getCoffeeSize() throws ClassNotFoundException, SQLException {
    	
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		Query<CoffeeSize> query = session.createQuery("from CoffeeSize");
		       
		List<CoffeeSize>coffeeSizes=query.getResultList();
		transaction.commit();
		session.close();
		return  (ArrayList<CoffeeSize>) coffeeSizes;

    }
}




