package com.my.package3;

/*
 * test1：见 实验1：Account_Customer.pdf
 * */
public class demo9 {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,1.23);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()+"]"+
                "has a account: id is "+customer.getAccount().getId()+",annualLnterestRate is"+
                customer.getAccount().getAnnualInterestRate()+"%, balance is "+customer.getAccount().getBalance());
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //取钱
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足");
            return;
        }
        balance -= amount;
        System.out.println("您已成功取出：" + amount + "元");
    }

    //存钱
    public void deposit(double amount) {
        if (balance > 0) {
            balance += amount;
            System.out.println("您成功存入：" + amount + "元");
        }
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account account){
        this.account = account;
    }
}