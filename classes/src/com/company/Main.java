package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car toyota = new Car();

	    BankAccount bob = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(123)456-7890");
	    bob.withdraw(100.0);
	    bob.deposit(50);
	    bob.withdraw(40);


	    VipCustomer joe = new VipCustomer();


    }
}
