package com.groupthree.service;

import com.groupthree.bean.CoffeeSize;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoffeeSizeServiceInterface {
    ArrayList<CoffeeSize> getCoffeeSize()throws ClassNotFoundException, SQLException;
}
