package com.my.package1;

/*
 * 100以内的所有质数
 * */
//public class demo6 {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//
//        for (int i = 100; i > 1; i--) {
//            boolean token = true;              //标志号
//            //优化2：对本身是质数的有效
//            for (int j = 2; j < Math.sqrt(j) ; j++) {//开方减少运算
//                if (i % j == 0) {
//                    token = false;            //有公约数则改变标志
//                    //优化1：不执行后面的，提高了运行效率。对非质数有效。
//                    break;
//                }
//            }
//            if (token) {            //没有改变则为质数
//                list.add(i);
//            }
//        }
//        System.out.println(list);
//    }
//}

import java.util.ArrayList;

//方法二
public class demo6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        label:for (int i = 100; i > 1; i--) {
            boolean token = true;              //标志号
            //优化2：对本身是质数的有效
            for (int j = 2; j < Math.sqrt(j) ; j++) {
                if (i % j == 0) {
                   continue label;
                }
            }
            if (token) {            //没有改变则为质数
                list.add(i);
            }
        }
        System.out.println(list);
    }
}