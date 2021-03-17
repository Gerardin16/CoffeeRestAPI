package com.groupthree.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupthree.bean.CoffeeSize;
import com.groupthree.bean.CoffeeType;

public interface CoffeeSizeDaoInterface {



	ArrayList<CoffeeSize> getCoffeeSize() throws ClassNotFoundException, SQLException;
}
