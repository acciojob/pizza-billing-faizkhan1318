package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int vegBasePrice=300;
    public static int nonVegBasePrice=400;
    public static int cheesePrice = 80;
    public static int vegToppingsPrice=70;
    public static int nonVegToppingsPrice = 120;
    public static int paperBagPrice = 20;
    private int myToppingAdded = 0;
    private int basePrice = 0;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? vegBasePrice : nonVegBasePrice;
        this.price = 0;
        this.bill ="Base Price Of The Pizza: " + basePrice + "\n";
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeawayAdded = false;
        // your code goes here
    }

    public int getPrice(){
        this.price = basePrice;
        if(isCheeseAdded){
            this.price += cheesePrice;
        }
        if(isToppingsAdded){
            this.price += myToppingAdded;
        }
        if(isTakeawayAdded){
            this.price += paperBagPrice;
        }

        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            this.myToppingAdded = isVeg ? vegToppingsPrice : nonVegToppingsPrice;
            isToppingsAdded = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isTakeawayAdded){
            isTakeawayAdded = true;
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        if(isCheeseAdded){
            bill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingsAdded){
            bill += "Extra Toppings Added: " + myToppingAdded + "\n";
        }
        if(isTakeawayAdded){
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }
        bill += "Total price: " + this.price + "\n";
        return this.bill;
    }
}
