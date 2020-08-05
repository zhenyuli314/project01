package com.my.package14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/*
* HashSet的使用方法；特点是速度快
* Set集合中均不能添加重复元素。
* 根据HashCode判断元素是否相同，HashCode相同则只保存一个，不同则全保存
* */
public class demo4 {
    String name;
    int id;

    public demo4(String name, int id) {//构造方法
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {//修改toString方法来显示对象属性
        return "demo4{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {//generate出equals方法和hashCode方法。用于判断hashcode是否相同，相同则为同一元素，不同则为不同元素
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        demo4 demo4 = (demo4) o;
        return id == demo4.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);//选择id为hashcode
    }

    public static void main(String[]args){
        Set set = new HashSet();//实例化HashSet
        demo4 p1 = new demo4("小明",1);
        demo4 p2 = new demo4("大壮",2);
        demo4 p3 = new demo4("阿强",3);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set.size());//当前集合中元素数量
        Iterator iterator = set.iterator();//实例化set的迭代器
        while (iterator.hasNext()){//通过迭代器打印出对象（toString方法修改了输出信息格式）
            System.out.println(iterator.next());
        }

        System.out.println("-------second---------");//修改p2的id值为5后，可以将新p2放入id=5的位置，此时存在两个id=5的大壮，分别位于id2和5的位置
        p2.id=5;
        set.add(p2);
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("-------third---------");//由于id2哈希位置的大壮id被改为5，所以equals方法为false，在哈希id2的位置插入了id=5的大壮和id=2的新大壮
        demo4 p4 = new demo4("大壮",2);
        set.add(p4);
        Iterator iterator3 = set.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        System.out.println("-------fourth---------");//将id=2的新大壮id改为4后，可以在哈希id2的位置再次放入id=2的大壮。此时哈希id2的位置有id=5,4,2三个大壮。即，将id修改后会影响equals方法对元素的判断，进而放入id不同的多个元素。
        p4.id = 4;
        demo4 p5 = new demo4("大壮",2);
        set.add(p4);
        set.add(p5);
        Iterator iterator4 = set.iterator();
        while (iterator4.hasNext()){
            System.out.println(iterator4.next());
        }
    }
}
