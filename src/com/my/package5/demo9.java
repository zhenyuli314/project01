package com.my.package5;

/*
* 接口的使用
* 1.接口使用interface来定义
* 2.java中，接口和类是并列的结构
* 3.如何定义接口：定义接口中的成员
*   3.1 JDK7及以前，只能定义全局常量和抽象方法
*       >全局常量：pub1 ic static final的，但是书写时，可以省略不写
        >抽象方法：pub1 ic abstract的
    3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法（略）
  4.接口中不能定义构造器！意味着接口不可以实例化。
  5.java开发中，接口通过让类去实现（implements）
    果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
    如果实现类没有覆盖接囗中所有的抽象方法，则此实现类仍为一个抽象类
  6.JaVa类可以实现多个接口--->弥补了Java单继承性的局限性
       格式： class AA extends BB implements CC, DD, EE
  7.接口与接口之间可以继承，而且可以多继承
=================================================================
  8.接口的具体使用，体现多态性
  9.接口，实际上可以看做是一种规范
* */
public class demo9 {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
        int maxSpeed = plane.MAX_SPEED;
        int minSpeed = plane.MIN_SPEED;
    }
}

interface Flyable {
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 7900; //省略public static final

    public abstract void fly();

    void stop();//省略public abstract
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过发动机去飞");
    }

    @Override
    public void stop() {
        System.out.println("通过刹车停下来");
    }
}

//----------------------------------------------------------------
interface AA {
    void method1();
}

interface BB {
    void method2();
}

interface CC extends AA, BB {
//method1 method2
}
