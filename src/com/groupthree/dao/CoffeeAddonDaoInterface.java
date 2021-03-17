package com.groupthree.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupthree.bean.CoffeeAddon;
import com.groupthree.bean.CoffeeSize;

public interface CoffeeAddonDaoInterface {



	ArrayList<CoffeeAddon> getCoffeeAddon() throws ClassNotFoundException, SQLException;
}
