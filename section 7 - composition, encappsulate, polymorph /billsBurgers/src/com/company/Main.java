package com.company;

class Hamburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition, double price){
        this.addition1Name = addition;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String addition, double price){
        this.addition2Name = addition;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String addition, double price){
        this.addition3Name = addition;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String addition, double price){
        this.addition4Name = addition;
        this.addition4Price = price;
    }

    public double itemizehamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType +
                " roll " + "price is " + this.price);
        if (addition1Name != null){
            hamburgerPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra "
                + this.addition1Price);
        }if (addition2Name != null){
            hamburgerPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra "
                    + this.addition2Price);
        }if (addition3Name != null){
            hamburgerPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra "
                    + this.addition3Price);
        }if (addition4Name != null){
            hamburgerPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra "
                    + this.addition4Price);
        }
        return hamburgerPrice;
    }
}

class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}

class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy",meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String addition, double price){
        this.healthyExtra1Name = addition;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String addition, double price){
        this.healthyExtra2Name = addition;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizehamburger() {
        double hamburgerPrice = super.itemizehamburger();
        if (healthyExtra1Name != null){
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra "
                    + this.healthyExtra1Price);
        }if (healthyExtra2Name != null){
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra "
                    + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}


public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy price is " + healthyBurger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizehamburger());

    }
}
