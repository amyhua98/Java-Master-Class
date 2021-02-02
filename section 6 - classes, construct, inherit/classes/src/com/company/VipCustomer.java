package com.company;

public class VipCustomer {

    private String name;
    private double creditLine;
    private String email;

    public VipCustomer() {
        this("N/A", 500.00, "N/A");
        System.out.println("Empty constructor called.");
    }

    public VipCustomer(String name, double creditLine) {
        this(name, creditLine, "N/A");
        this.name = name;
        this.creditLine = creditLine;
        System.out.println(name + " " + creditLine + " " + email);
    }

    public VipCustomer(String name, double creditLine, String email) {
        this.name = name;
        this.creditLine = creditLine;
        this.email = email;
        System.out.println(name + " " + creditLine + " " + email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public String getEmail() {
        return email;
    }
}
