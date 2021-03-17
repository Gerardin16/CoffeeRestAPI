package com.groupthree.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.groupthree.bean.CoffeeAddon;
import com.groupthree.bean.CoffeeSize;
import com.groupthree.bean.CoffeeType;
import com.groupthree.bean.CoffeeVoucher;
import com.groupthree.bean.PersonDetails;
import com.groupthree.service.BillTransactionServiceInterface;
import com.groupthree.service.CoffeeAddonServiceInterface;
import com.groupthree.service.CoffeeSizeServiceInterface;
import com.groupthree.service.CoffeeTypeServiceInterface;
import com.groupthree.service.CoffeeVoucherServiceInterface;
import com.groupthree.service.PersonDetailsServiceInterface;




@RestController
public class CoffeeJsonResource {
	@Autowired
    private BillTransactionServiceInterface transactionService;
	@Autowired
    private PersonDetailsServiceInterface personDetails;
	@Autowired
    private CoffeeAddonServiceInterface coffeeAddon;
	@Autowired
    private CoffeeVoucherServiceInterface coffeeVoucher;
	@Autowired
    private CoffeeSizeServiceInterface coffeeSize;
	@Autowired
    private CoffeeTypeServiceInterface coffeeType;
	
	ArrayList<PersonDetails> person;
	PersonDetails customer;
	ArrayList<CoffeeType> coffeeTypeList;
	ArrayList<CoffeeSize> coffeeSizeList;
	ArrayList<CoffeeAddon> coffeeAddonList;
	ArrayList<CoffeeVoucher> coffeeVoucherList;
	 ArrayList bill;
	
	@GetMapping(path = "/json/customer/{phnum}", produces="application/json")
	public ArrayList<PersonDetails> searchRecordByPhoneno(@PathVariable("phnum")long person_phoneno) {
		
		try {
			 person=personDetails.searchRecordByPhoneno(person_phoneno);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}
	
	@PostMapping(path = "/json/customer/{custname}/{phnum}",consumes ="application/json" )
	public PersonDetails insertPerson(@PathVariable("custname")String name,@PathVariable("phnum")long person_phoneno)  {
		try {
			customer=personDetails.insertPerson(name,person_phoneno);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
		
	
}
	
	@GetMapping(path = "/json/coffeetypes", produces="application/json")
	public ArrayList<CoffeeType> getCoffeeType() {
		
		try {
			coffeeTypeList=coffeeType.getCoffeeType();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coffeeTypeList;
	}
	@GetMapping(path = "/json/coffeesizes", produces="application/json")
	public ArrayList<CoffeeSize> getCoffeeSize() {
		
		try {
			coffeeSizeList=coffeeSize.getCoffeeSize();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coffeeSizeList;
	}
	
	@GetMapping(path = "/json/coffeeaddons", produces="application/json")
	public ArrayList<CoffeeAddon> getCoffeeAddons() {
		
		try {
			coffeeAddonList=coffeeAddon.getCoffeeAddon();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coffeeAddonList;
	}
	@GetMapping(path = "/json/coffeevoucher", produces="application/json")
	public ArrayList<CoffeeVoucher> getCoffeeVoucher() {
		
		try {
			coffeeVoucherList=coffeeVoucher.getCoffeeVoucher();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coffeeVoucherList;
	}
	@PostMapping(path = "/json/customer/order/{custid}/{orderno}/{typeid}/{sizeid}/{addonid}",consumes ="application/json")
	public void createCoffeeOrder(@PathVariable("custid")int userid, @PathVariable("orderno")String OrderNum, 
			@PathVariable("typeid")int selectedCoffeeType,@PathVariable("sizeid") int selectedCoffeeSize,
			@PathVariable("addonid")int selectedAddon) {
		 try {
			transactionService.createCoffeeOrder(userid,OrderNum,selectedCoffeeType,selectedCoffeeSize,selectedAddon);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		 
		 @PostMapping(path = "/json/customer/bill/{custid}/{orderno}/{voucherid}",consumes ="application/json")
		 public ArrayList  generateBill(@PathVariable("custid")int userid, @PathVariable("orderno")String OrderNum, 
				 @PathVariable("voucherid")int selectedVoucher) {
			
			try {
				bill = transactionService.generateBill(userid,OrderNum,selectedVoucher);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return bill;
		 }
}
	
	

