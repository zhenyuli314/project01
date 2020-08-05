package com.my.package14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* 创建Map集合，创建test3对象，并将test3对象添加到集合中（test对象的id作为Map集合的键），并将id为015的对象从集合中移除。
* */
public class test3 {
    String name;
    int id;

    public test3(String name, int id) {
        this.name = name;
        this.id = id;
    }



    public static void main(String[]args){
        test3 p1 = new test3("a",001);
        test3 p2 = new test3("b",005);
        test3 p3 = new test3("c",004);
        test3 p4 = new test3("d",015);

        Map map = new HashMap();

        map.put(p1.id,p1.name);
        map.put(p2.id,p2.name);
        map.put(p3.id,p3.name);
        map.put(p4.id,p4.name);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){ 
            Object key = iterator.next();
            System.out.println(map.get(key));
        }
        System.out.println("____删除015后______");
        map.remove(015);
        Set set2 = map.keySet();
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()){
            Object key = iterator2.next();
            System.out.println(map.get(key));
        }
    }
}
