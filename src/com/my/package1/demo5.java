package com.my.package1;

import java.util.Scanner;

/*
* 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
* 暂停条件在循环体内，借助break。初始条件、循环条件、迭代条件为空
* 不在循环条件部分限制次数的结构：for(;;)或while（true）
* */
public class demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_fu = 0;
        int num_zheng = 0;
        for(;;){
            int number = scan.nextInt();
            if (number<0){
                num_fu++;
            } else if (number>0){
                num_zheng++;
            }else {
                break;
            }

        }
        System.out.println("负数个数："+num_fu);
        System.out.println("正数个数："+num_zheng);
    }
}
