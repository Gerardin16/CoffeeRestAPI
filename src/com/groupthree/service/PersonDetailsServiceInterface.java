package com.groupthree.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.groupthree.bean.PersonDetails;

public interface PersonDetailsServiceInterface {

//	    PersonDetails getPersonDetails()throws ClassNotFoundException, SQLException;
		ArrayList<PersonDetails> searchRecordByPhoneno(long person_phoneno)throws ClassNotFoundException,SQLException;

		PersonDetails insertPerson(String personName, long personPhoneno) throws ClassNotFoundException, SQLException;

	
}

