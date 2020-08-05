package com.my.package14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
* TreeSet集合中不能添加重复元素，特点是存放有序（Comparable调整顺序）
*
* */
public class demo3 implements Comparable {
    int id;
    int age;
    String name;

    public demo3(int id, int age, String name) {//generate出构造方法
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {//generate重写toString方法来输出对象的信息
        return "demo3{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {//调用Comparable接口的compareTo方法，根据id调整顺序
        demo3 p = (demo3) o;
        int diff = this.id - p.id;//id也可以换成int型的其他标志
        if (diff != 0) {
            diff = diff / Math.abs(diff);//返回1或-1来判断先后顺序
        }
        return diff;
    }


    public static void main(String[] args) {
        Set set = new TreeSet();
        demo3 p1 = new demo3(1,18,"a");
        demo3 p2 = new demo3(3,5,"b");
        demo3 p3 = new demo3(2,20,"c");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p3);//重复元素不会添加到集合中

        Iterator iter = set.iterator();//实例化迭代器
        while (iter.hasNext()){//是否有下一个元素
            System.out.println(iter.next());//获取下一个元素
        }
    }
}
