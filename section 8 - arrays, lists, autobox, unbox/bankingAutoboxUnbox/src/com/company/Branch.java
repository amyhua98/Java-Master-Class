package com.company;

import java.util.ArrayList;

public class Branch {
        private String name;
        private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers =  new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initalAmount){
        if(findCustomer(name) == null){
            this.customers.add(new Customer(name,initalAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name){
        for (int i = 0; i < customers.size(); i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }


}
