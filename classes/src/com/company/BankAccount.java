package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    public BankAccount(){
        this("99999", 0.00, "N/A", "N/A", "N/A");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNum){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
        System.out.println(this.accountNumber + " , " + this.balance + " , " + this.customerName + " , " + this.email + " , " + this.phoneNum);
    }

    public BankAccount(String customerName, String email, String phoneNum) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit (double amount){
        if (amount < 0){
            System.out.println("Invalid amount. The deposit amount is lower than $0. Please try again");
        }else{
            this.balance += amount;
            System.out.println("You have deposited the amount of $" + amount + " to your account. Your balance is now $" + this.balance);
        }
    }

    public void withdraw (double amount){
        if (this.balance - amount <= 0){
            System.out.println("Invalid amount. The withdraw amount is less than your balance. Please try again");
        }else{
            this.balance -= amount;
            System.out.println("You have withdrawen the amount of $" + amount + " from your account. Your balance is now $" + this.balance);
        }
    }
}
