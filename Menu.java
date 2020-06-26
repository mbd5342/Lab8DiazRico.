package edu.psu.ist;

import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private int price;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, int price){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.price = price;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuItem() + ", Menu Id: " + menu.getmenuId() + ", Price:  " + menu.getPrice());
        }
    }
}
