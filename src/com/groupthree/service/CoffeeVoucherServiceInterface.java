package com.groupthree.service;

import com.groupthree.bean.CoffeeVoucher;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoffeeVoucherServiceInterface {

    ArrayList<CoffeeVoucher> getCoffeeVoucher()throws ClassNotFoundException, SQLException;
}
