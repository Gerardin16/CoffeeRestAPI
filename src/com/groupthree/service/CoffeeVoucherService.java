package com.groupthree.service;

import com.groupthree.bean.CoffeeVoucher;
import com.groupthree.dao.CoffeeVoucherDao;
import com.groupthree.dao.CoffeeVoucherDaoInterface;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CoffeeVoucherService implements CoffeeVoucherServiceInterface{
		
		@Autowired
        private CoffeeVoucherDaoInterface coffeeVoucherDao;
	
	
        public CoffeeVoucherDaoInterface getCoffeeVoucherDao() {
			return coffeeVoucherDao;
		}


		public void setCoffeeVoucherDao(CoffeeVoucherDaoInterface coffeeVoucherDao) {
			this.coffeeVoucherDao = coffeeVoucherDao;
		}


		@Override
        public ArrayList<CoffeeVoucher> getCoffeeVoucher() throws ClassNotFoundException, SQLException {
            return coffeeVoucherDao.getCoffeeVoucher();

        }
}
