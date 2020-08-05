package com.my.package14;

import java.util.*;

/*
* 分别向Set集合以及List集合中添加“A”，“a”，“c”，“C”，“a”五个元素，观察重复值“a”能否重复地在List集合以及Set集合中添加。
* */
public class test2 {
    public static void main(String[]args){
        Set set = new TreeSet();
        List list = new ArrayList();
        String[] items = {"A","a","c","C","a"};
        for (String tpm:items){
            set.add(tpm);
            list.add(tpm);
        }
        System.out.println("这是List集合的输出结果：");
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"__");
        }
        System.out.println();
        System.out.println("这是Set集合的输出结果：");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"__");
        }
    }
}
