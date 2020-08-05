package com.my.package14;

import java.util.ArrayList;
import java.util.List;

/*
* 将1~100之间的所有正整数存放在一个List集合中，并将集合中索引的位置时10的对象从集合中移除
* */
public class test1 {
    public static void main(String[]args){
        List list = new ArrayList();
        for (int i = 0;i<100;i++){
            list.add(i);
        }
        System.out.println("列表中元素个数为："+list.size());
        list.remove(10);
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"__");
        }
    }

}
