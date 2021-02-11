package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        if (bank.addBranch("Chicago")) {
            System.out.println("Chicago branch created");
        }

        bank.addCustomer("Chicago", "Tim", 259.45);
        bank.addCustomer("Chicago", "Kevin", 185.31);
        bank.addCustomer("Chicago", "Robert", 225.62);

        bank.addBranch("California");
        bank.addCustomer("California", "Bob", 190.59);

        bank.addCustomerTransaction("California", "Bob", 50.26);
        bank.addCustomerTransaction("California", "Bob", 67.23);
        bank.addCustomerTransaction("California", "John", 45.15);

        bank.listCustomers("Chicago", true);
        bank.listCustomers("California", true);

        bank.addBranch("Texas");

        if (!bank.addCustomer("Texas", "Donald", 5.53)) {
            System.out.println("Error Texas branch does not exist");
        }

        if (!bank.addBranch("Chicago")) {
            System.out.println("New York branch already exists");
        }

        if (!bank.addCustomerTransaction("Chicago", "Smith", 120.69)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Chicago", "John", 36.20)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
