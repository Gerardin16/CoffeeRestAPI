package com.groupthree.service;

import com.groupthree.bean.CoffeeType;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoffeeTypeServiceInterface {
    ArrayList<CoffeeType> getCoffeeType()throws ClassNotFoundException, SQLException;


}
