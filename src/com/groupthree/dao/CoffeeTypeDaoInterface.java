package com.groupthree.dao;
import java.sql.SQLException;
import java.util.ArrayList;


import com.groupthree.bean.CoffeeType;

public interface CoffeeTypeDaoInterface {

    ArrayList<CoffeeType> getCoffeeType() throws ClassNotFoundException, SQLException;


}
