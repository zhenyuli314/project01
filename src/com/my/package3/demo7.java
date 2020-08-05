package com.my.package3;

/*
this关键字的使用
1.this可以用来修饰、调用：属性、方法、构造器
2.this修饰属性和方法：
    this理解为：当前对象、当前正在创建的对象

    2.1在类的方法中，我们可以使用"th1s.属性"或"this.方法"的方式，调用当前对象属性或方法。
    但是，通常情况下，我们都选择省略"this."。特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用"this.变量"的方式，
    表明此变量是属性，而非形参。
    2.2在类的构造器中，我们可以使用"th1s.属性"或"this.方法"的方式，调用当前正在创建的对象属性或方法。
    但是，通常情况下，我们都选择省略"this."。特殊情况下，如果构造器的形参和类的属性同名时，我们必须显式的使用"this.变量"的方式，
    表明此变量是属性，而非形参。
3. this修饰、调用构造器
①我们在类的构造器中，可以显式的使用"this（形参列表）"方式，调用本类中指定的其他构造器。
②构造器中不能通过"this（形参列表）"方式调用自己。
③如果一个类中有n个构造器，则最多有n-1构造器中使用了"this（形参列表）"。
④规定："ths（形参列表）"必须声明在当前构造器的首行。
⑤构造器内部，最多只能声明一个"this（形参列表）"，用来调用其他的构造器。

* */
public class demo7 {
    public static void main(String[] args) {
        Person7 p7 = new Person7(10,"jim");//调用构造器3
        p7.eat();
        p7.setAge(10);
        System.out.println(p7.getAge());


    }
}

class Person7 {
    private int age;
    private String name;

    //构造器1
    public Person7() {
        System.out.println("构造器1：这里是40行逻辑代码");
    }

    //构造器2
    public Person7(int age) {
        this();//调用构造器1
        this.age = age;
        System.out.println("在构造器2中给age赋值了");
    }
    //构造器3
    public Person7(int age,String name){
        this(age);//调用构造器2
        this.name = name;
        System.out.println("在构造器3中给name属性赋值了");
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("吃饭");
        sleep();
    }

    public void sleep() {
        System.out.println("睡觉");
    }

}
