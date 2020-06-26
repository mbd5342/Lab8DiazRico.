package edu.psu.ist;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;  //Items in the order

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }



    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public void setCustomer(Customer cust){
        cust = cust;
    }

    public void setMenuItem(Menu menu) {
        menuItem.add(menu);
    }

    public void getMenuItem(int id)
    {

    }

    
}
