package com.groupthree.service;

import com.groupthree.bean.CoffeeAddon;
import com.groupthree.dao.CoffeeAddonDao;
import com.groupthree.dao.CoffeeAddonDaoInterface;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CoffeeAddonService implements CoffeeAddonServiceInterface {
	@Autowired
    private CoffeeAddonDaoInterface coffeeAddonDao;
	

    public CoffeeAddonDaoInterface getCoffeeAddonDao() {
		return coffeeAddonDao;
	}


	public void setCoffeeAddonDao(CoffeeAddonDaoInterface coffeeAddonDao) {
		this.coffeeAddonDao = coffeeAddonDao;
	}


	@Override
    public ArrayList<CoffeeAddon> getCoffeeAddon() throws SQLException, ClassNotFoundException {
        return coffeeAddonDao.getCoffeeAddon();

    }
}