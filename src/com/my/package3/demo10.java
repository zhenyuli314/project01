package com.my.package3;

/*
 * test2：见  实验2：Account_Customer_Bank.pdf
 * */
public class demo10 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("李","振宇");
        bank.addCustomer("郝","伟");
        Customer1 person1 =  bank.getCustomer(0);
        Customer1 person2 = bank.getCustomer(1);
        System.out.println("银行有"+bank.getNumberOfCustomer()+"位客户！");

        System.out.println("这是"+person1.getFirstName()+person1.getLastName()+"的银行信息：");
        Account1 act1 =new Account1(10000);
        person1.setAccount(act1);
        System.out.println(person1.getFirstName()+person1.getLastName()+"的初始金额为"+
                person1.getAccount().getBalance());
        person1.getAccount().withdraw(5000);
        System.out.println(person1.getFirstName()+person1.getLastName()+"的余额为"+
                person1.getAccount().getBalance());

        System.out.println("-------------------------------------------------");
        System.out.println("这是"+person2.getFirstName()+person2.getLastName()+"的银行信息：");
    }
}

class Account1 {
    private double balance;

    public Account1(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double account) {
        if (account > 0) {
            balance += account;
            System.out.println("您已经成功存款：" + account + "元");
            return;
        }
        System.out.println("请输入正数！！！");
    }

    public void withdraw(int account) {
        if (balance > account) {
            balance -= account;
            System.out.println("您已经成功取款：" + account + "元");
            return;
        }
        System.out.println("余额不足！！！请重新输入");
    }
}

class Customer1 {
    private String firstName;
    private String lastName;
    private Account1 account1;

    public Customer1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account1 getAccount() {
        return account1;
    }

    public void setAccount(Account1 acct) {
        this.account1 = acct;
    }

}

class Bank {
    private Customer1[] customers;
    private int numberOfCustomer;
    public Bank() {
        numberOfCustomer = 0;
        customers = new Customer1[10];

    }
    public void  addCustomer(String f,String l){
        Customer1 cus = new Customer1(f,l);
        customers[numberOfCustomer++] = cus;
//        numberOfCustomer ++;
    }
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }
    public Customer1 getCustomer(int index){
        if (index<numberOfCustomer&&index>0){
            return customers[index];
        }
        return null;
    }
}
