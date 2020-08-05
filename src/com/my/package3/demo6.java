package com.my.package3;
/*
* 类的结构之三：构造器的使用（构造方法、constructor）
* 一、构造器的作用：
*    1.创建对象
*    2.初始化对象的信息
* 二、说明：
*    1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
*    2.定义构造器的格式：权限修饰符类名（形参列表）{}
*    3.一个类中定义的多个构造器，彼此构成重载
*    4.一旦我们显式的定义了类的构造器之后，系统就不在提供默认的空参构造器
*    5.一个类中，至少有一个构造器
*
* 总结：属性赋值的先后顺序
*   ①默认初始化
*   ②显式初始化
*   ③构造器中赋值
*   ④通过"对象，方法"或"对象，属性"的方式，赋值
*   以上操作的先后顺序：①-②-③-④
* */
public class demo6 {
    public static void main(String[] args) {
        //创建类的对象：new + 构造器
        Person p1 = new Person(10);
        Person p2 = new Person("tom");
        p2.show();


//        p.eat();
    }
}

class Person{
    //属性
    int age;
    String name;

    //构造器1
    public Person(int a){
        System.out.println("传入的参数："+a);
        System.out.println("构造方法");
    }

    //构造器2（重载）
    public Person(String na){
        name = na;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void show(){
        System.out.println("name属性的值："+name);
    }
}