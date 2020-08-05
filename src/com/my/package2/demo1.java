package com.my.package2;
/*
* 数组的长度一旦确定，就能修改。
* 、基本数据类型元素的数组、引用数据类型元素的数组（string、Array、interface）
* 一维数组的声明和初始化
* 如何调用数组的指定位置的元素
* 如何获取数组的长度
* 如何遍历数组
* 数组元素的默认初始值
* 数组的内存解析
* */

public class demo1 {
    public static void main(String[] args) {
        //1.初始化
        int[] idss = new int[]{0,1,3};//静态初始化
        String[] strs = new String[5];//动态初始化

        //2.调用指定位置元素
        int a = idss[0];
        System.out.println(a);
        strs[0] = "aaa";
        System.out.println(strs[0]);

        //3.获取数组长度
        int length = strs.length;
        System.out.println(length);

        //4.遍历数组元素
        for (int i=0;i<length;i++){
            System.out.println(strs[i]);
        }

        //5.数组元素的默认初始化值
        //short、int、long ==> 0
        //double ==> 0.0
        //char ==> 0 非 '0'
        //boolean ==> false
        //string ==> null
    }
}
