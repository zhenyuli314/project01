package com.my.package2;
/*
* 数组中常见的异常：
* 数组角标越界异常：ArrayIndexOutOfBoundsExcetin
* 空指针异常：NullPointerException
* */
public class demo9 {

    public static void main(String[] args) {
        //空指针异常：
        //情况一：
        int[] arr1 = new int[]{1,2,3};
        arr1 = null;//栈中索引重新赋值，切断联系
        System.out.println(arr1[0]);//空指针异常

        //情况2：
        int[][] arr2 = new int[4][];//子数组未初始化
        System.out.println(arr2[0]);//null
        System.out.println(arr2[0][0]);//空指针异常
    }
}
