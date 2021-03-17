package com.groupthree.service;

import com.groupthree.bean.CoffeeType;
import com.groupthree.dao.CoffeeTypeDao;
import com.groupthree.dao.CoffeeTypeDaoInterface;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CoffeeTypeService implements CoffeeTypeServiceInterface{
	
	@Autowired
    private CoffeeTypeDaoInterface coffeeTypeDao;
	
	

    public CoffeeTypeDaoInterface getCoffeeTypeDao() {
		return coffeeTypeDao;
	}



	public void setCoffeeTypeDao(CoffeeTypeDaoInterface coffeeTypeDao) {
		this.coffeeTypeDao = coffeeTypeDao;
	}



	@Override
    public ArrayList<CoffeeType> getCoffeeType() throws ClassNotFoundException, SQLException {
        return coffeeTypeDao.getCoffeeType();
    }

}
