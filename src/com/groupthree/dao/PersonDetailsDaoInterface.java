package com.groupthree.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.groupthree.bean.PersonDetails;

public interface PersonDetailsDaoInterface {

     public PersonDetails insertPerson(String name, long personPhoneno) ;
	ArrayList<PersonDetails> searchRecordByPhoneno(long person_phoneno);
}