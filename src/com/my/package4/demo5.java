package com.my.package4;
/*
*面试题：==和equa1s（）区别
一、回顾==的使用：
== ：运算符
    1.可以使用在基本数据类型变量和引用数据类型变量中
    2.如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
      如果比较的是引用数据类型变量：比较两个对象的地址值是否相同。即两个引用是否指向同一个对象实体
    补充，==符号使用时，须保证符号左右两边的变量类型一致。
二、equa1s（）方法的使用
    1.是一个方法，而非运算符
    2.只能适用于引用数据类型
    3. Object：类中equa1s（）的定义：
    public boolean equals（object ob3）{
        return（this = ob3）；
        }
    说明：Object类中定义的equa1s（）和==的作用是相同的：比较两个对象的地址值是否相同，即两个引用是否指
    4.像 String、Date、Fi1e、包装类等都重写了 bject类中的equa1s（）方法。重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
    5.通常情况下，我们自定义的类如果使用equa1s（）的话，也通常是比较两个对象的"实体内容"是否相同。
      那么，我就需要对 Object类中的equa1s（）进行重写
      重写的原则：比较两个对象的实体内容是否相同
* */
public class demo5 {
}