package com.groupthree.util;

public class DisplayBill<BT,BN> {
	BT obj1; 
    BN obj2;  
  
    // constructor 
    public DisplayBill(BT obj1, BN obj2) 
    { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
  
    // To print objects of T and U 
    public void print() 
    { 
        System.out.print(obj1); 
        System.out.println(obj2); 
    }
}
