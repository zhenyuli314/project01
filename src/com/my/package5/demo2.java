package com.my.package5;
/*
* 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
* 定义封装这些属性的方法。账号要自动生成.
* 编写主类，使用银行账户类，输入、输出3个储户的上述信息考虑：哪些属性可以设计成 static属性。
* */
public class demo2 {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("qwerty",1000);
        Account account3 = new Account("123456",1000);
        account1.getId();
        account2.getId();
        account3.getId();

        Account.setMin_balance(1);
        Account.setRate(0.001);
        Account.getRate();
        Account.getInit();

    }
}
class Account{
    private int id;
    private String password;
    private double balance;
    private static double rate;
    private static double min_balance;
    private static int init = 1001;
    public Account(){
        id = init++;
    }
    public Account(String password,double balance){
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static void setMin_balance(double min_balance) {
        Account.min_balance = min_balance;
    }

    public static double getMin_balance() {
        return min_balance;
    }

    public static int getInit() {
        return init;
    }
}
