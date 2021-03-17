package com.groupthree.service;
import com.groupthree.bean.PersonDetails;
import com.groupthree.dao.PersonDetailsDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupthree.dao.PersonDetailsDaoInterface;

@Service
public class PersonDetailsService implements PersonDetailsServiceInterface{
	
	@Autowired
	private PersonDetailsDao personDetailsDao;
	

public PersonDetailsDao getPersonDetailsDao() {
		return personDetailsDao;
	}

	public void setPersonDetailsDao(PersonDetailsDao personDetailsDao) {
		this.personDetailsDao = personDetailsDao;
	}

@Override
public ArrayList<PersonDetails> searchRecordByPhoneno(long person_phoneno) throws ClassNotFoundException, SQLException {
	ArrayList<PersonDetails> personDetails= personDetailsDao.searchRecordByPhoneno(person_phoneno);
				

	return personDetails;
}

@Override
public PersonDetails insertPerson(String name,long personPhoneno) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	return  personDetailsDao.insertPerson(name, personPhoneno);
}





}
