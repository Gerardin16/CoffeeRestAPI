package com.groupthree.util;

import com.groupthree.bean.CoffeeAddon;
import com.groupthree.bean.CoffeeBill;
import com.groupthree.bean.CoffeeSize;
import com.groupthree.bean.CoffeeType;
import com.groupthree.util.DisplayBill;
import com.groupthree.bean.PersonDetails;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class BeverageHelper {
	static DisplayBill <String, Double> objBill;
  
       
	public static void displayPersonName(PersonDetails pt){
		System.out.println(pt.getPersonName());
	}

	public static void displayCoffeeType(CoffeeType ct){
		System.out.println(ct.getCoffeeName()+" - "+ ct.getCoffeeNamePrice());
	}
	public static void displayCoffeeSize(CoffeeSize cs) {
		System.out.println(cs.getCoffeeSizeName()+" - "+cs.getCoffeeSizePrice());
	}
	public static void displayCoffeeAddOn(CoffeeAddon ca) {
		System.out.println(ca.getCoffeeAddonName()+" - "+ca.getCoffeeAddonPrice());
	}

	public static void displayCoffeeBill(ArrayList bill) {

		System.out.println("==========================");
		System.out.println("Final Invoice");
		objBill = new DisplayBill<String, Double>("Total Value:",(Double) bill.get(0)); 
		objBill.print();
		objBill = new DisplayBill<String, Double>("Discount:",(Double) bill.get(1)); 
		objBill.print();
		objBill = new DisplayBill<String, Double>("Net Value:",(Double) bill.get(2)); 
		objBill.print();
		objBill = new DisplayBill<String, Double>("GST:",(Double) bill.get(3)); 
		objBill.print();
		objBill = new DisplayBill<String, Double>("Service Tax:",(Double) bill.get(4)); 
		objBill.print();
		objBill = new DisplayBill<String, Double>("Total Bill:",(Double) bill.get(5)); 
		objBill.print();
		
	}
}

