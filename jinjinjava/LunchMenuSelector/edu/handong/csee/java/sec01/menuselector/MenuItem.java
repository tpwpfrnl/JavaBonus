package edu.handong.csee.java.sec01.menuselector;

    /** 
     * This is a class, MenuItem.
     * We can save our menu item information.
     * It contains several behaviors such as setPrice and setCalories.
    */

public class MenuItem {

    /** 
     * This is a String variable, itemName.
     * It contains the information about the name of menu.
    */

    String itemName; // as instance variable = non-static field

    /** 
     * This is a String variable, restaurantName.
     * It contains the information about the name of reataurant.
    */

    static String restaurantName; // class variable = static field

    /**
     * This is a integer variable, price.
     * It contains the information aboout the menu's price.
     */

    public int price;

    /**
     * This is a integer variable, numOrdersPreparing.
     * It contains the number of preparing order.
     */

    int numOrdersPreparing;

    /**
     * This is a integer variable, calories.
     * It contains the calories of the menu.
     */

    int calories;
    
    /**
     * This is a main method for MenuItem class.
     * If you compile this program, it starts at this.
     */

    public static void main(String[] args){
        int count = 32_09; //for readable

        System.out.println("count = " + count);

        MenuItem myMenuItemNoodle = new MenuItem(); //Can use myMenuItemNoodle = MenuItem.class 
        myMenuItemNoodle.setName(args[0]);
        myMenuItemNoodle.setPrice(Integer.parseInt(args[1]));
        myMenuItemNoodle.setCalories(Integer.parseInt(args[2]));

        System.out.println("The price of my menu is : " + myMenuItemNoodle.getPriceThisItem(args[0]));
    }

    /**
     * This is a method, setName.
     * It sets the name of the menu.
     */

    public void setName(String name){
        itemName = name;
    }

    /**
     * This is a method, setPrice.
     * It sets the price of the menu.
     */

    void setPrice(int priceGiven){
        price = priceGiven;
    }

    /**
     * This is a method, setCalrories.
     * It sets the calories of the menu.
     */

    void setCalories(int caloriesGiven){
        calories = caloriesGiven;
    }

    /**
     * This is a integer variable, getPriceThisItem.
     * If itemName is the same with String name,
     * this returns price.
     */

    int getPriceThisItem(String name){
        if(itemName.equals(name)){
            return price;
        }else{
            return -1;
        }
    }

    /**
     * This is a integer variable, getKnowCalories.
     * If itemName is the same with String name,
     * this returns calories.
     */

    int getKnowCalories(String name){
        if(itemName.equals(name)){
            return calories;
        }else{
            return -1;
        }
    }
}