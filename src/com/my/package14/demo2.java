package com.my.package14;

import java.util.*;

/*
* List接口
* ArrayList方便查找
* LinkedList方便添加和删除
* 二者的实际用法完全相同，效果相近，在实际使用过程中可互相替换
* list中可以拥有重复的元素
* */
public class demo2 {
    public static void main(String[]args){
        List list = new ArrayList();//实例化ArrayList对象，使用的为List接口，List接口拥有Collection接口的全部方法
//        List list = new LinkedList();//效果与ArrayList相同
        list.add("abcdefg");//添加元素
        list.add("1234567");
        System.out.println(list.size());//元素大小，返回int型列表长度
        System.out.println(list.get(0));//获取指定索引元素
        list.remove(1 );//移除指定索引元素
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.add(0,"987654");//在指定位置插入元素
        list.set(1,"hhhhhhh");//修改指定元素内容

    }
}
