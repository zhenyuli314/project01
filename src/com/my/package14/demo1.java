package com.my.package14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* Collection接口
* */
public class demo1 {
    public static void main(String[]args){
        Collection c = new ArrayList();//实例化集合类对象（使用Collection接口）
        System.out.println(c.isEmpty());

        c.add("你好");
        c.add(3.14);
        c.add(new Object());

        System.out.println(c.isEmpty());
        System.out.println(c.size());

        Iterator it = c.iterator();//创建迭代器，集合对象的.iterator()方法
        while (it.hasNext()){//判断是否有下一个元素
            Object o =it.next();//获取集合中元素
            System.out.println(o);
        }
    }
}
