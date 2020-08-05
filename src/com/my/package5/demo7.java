package com.my.package5;
/*
*abstract关键字的使用
1. abstract：抽象的
2. abstract可以用来修饰的结构：类、方法
3. abstract修饰类：抽象类
        >此类不能实例化
        >抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
        >开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
4. abstract修饰方法：抽象方法
        >抽象方法只有方法的声明，没有方法体
        >包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
        * 若子类重写了父类中的所有的抽象方法后，此子类方可实例化
        * 若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，需要使用 abstract修饰

abstract使用上的注意点：
* abstract不能用来修饰私有方法、静态方法、final的方法、final的类
* */

/*
匿名子类的匿名对象
 */
public class demo7 {
    public static void main(String[] args) {

        method(new Person() {//匿名子类的匿名对象（person是父类）
            @Override
            public void eat() {
                System.out.println("匿名子类吃饭！");
            }

            @Override
            public void walk() {
                System.out.println("匿名子类跑步！！");
            }
        });
    }

    public static void method(Person p) {
        p.eat();
        p.walk();
    }
}

abstract class Person {
    public abstract void eat();

    public abstract void walk();
}
