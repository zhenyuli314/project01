package com.my.package5;
 /*
 * 单例设计模式：
 * 1.所谓类的单例设计模式，就是采取一定的方法保证整个的软件系统中，对某个类只能存在一个对象实例
 *
 * 2.如何实现？
 *      饿汉式 vs 懒汉式
 * 3.区分饿汉式和懒汉式
 *      饿汉式：对象加载时间过长；线程安全的
 *      懒汉式（更好一点）：延迟对象的创建。线程不安全 --->到多线程内容，再修改
 * */
public class demo3 {
     public static void main(String[] args) {
         Bank bank1 = Bank.getAccount();
         Bank bank2 = Bank.getAccount();
         System.out.println(bank1 == bank2);

         Bank2 bank3 = Bank2.getAccount2();
         Bank2 bank4 = Bank2.getAccount2();
         System.out.println(bank3 == bank4);
     }
}
//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }

    //2.在内部创建此类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank account = new Bank();

    //3.提供公共的静态方法，返回类的对象
    public static Bank getAccount(){
        return account;
    }
}
//懒汉式
class Bank2{
    //1.私有化类的构造器
    private Bank2(){

    }

    //2.声明当前类的对象，没有初始化
    //4.要求类的对象也必须声明为静态的
    private static Bank2 account2 = null;

    //3.声明public、static的返回当前类对象的方法
    public static Bank2 getAccount2(){
        if (account2 == null){
            account2 = new Bank2();
        }
        return account2;
    }
}
