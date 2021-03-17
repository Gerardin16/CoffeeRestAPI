package com.groupthree.dao;
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

import com.groupthree.bean.PersonDetails;

@Repository
public class PersonDetailsDao implements PersonDetailsDaoInterface{
	
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
		@Override
		public ArrayList<PersonDetails> searchRecordByPhoneno(long person_phoneno) throws ClassNotFoundException, SQLException {
//			
			
			//For every Transaction one Session object
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			
			Query<PersonDetails> query = session.createQuery("from PersonDetails where personPhoneNo=:pnum" );
			query.setParameter("pnum", person_phoneno) ;       
			List<PersonDetails> person=query.getResultList();
			transaction.commit();
			session.close();
			return   (ArrayList<PersonDetails>) person;
}

		public PersonDetails insertPerson(String name, long personPhoneno) throws ClassNotFoundException, SQLException {
		
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			PersonDetails person=new PersonDetails(name,personPhoneno);
			
			session.save(person);
			transaction.commit();
			session.close();
			return person;
		}
}