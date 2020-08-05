package com.my.package14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
* Map主要讲“键——值”关系，HashMap比TreeMap速度快，适用性广。
* */
public class demo5 {
    public static void main(String[] args) {
        Map map = new HashMap();//实例化HashMap

        map.put("String","这是一个字符串");//使用put方法添加元素，前面的为key，后面的为value
        map.put("Object",new Object());
        map.put("int",1234);
        map.put("数字",1234);
        map.put(1,1);
        map.put(new Object(),new Object());
        map.put(null,null);

        System.out.println(map.size());//获取元素数量

        Set keyset = map.keySet();//获取map的key值集合
        Iterator iterator = keyset.iterator();//通过迭代器遍历键值集合
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");
        System.out.println(map.get(1));//通过get方法获取对应key的value
    }

}
