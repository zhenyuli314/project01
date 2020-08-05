package com.my.package1;

import java.util.Scanner;

/*
* 求最大公约数和最小公倍数
* 比如：12和20的最大公约数是4，最小公倍数是60
* 注意：必须要添加break；否则会输出多个值
* */
public class demo3 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scan.nextInt();

//      -----------最大公约数---------------
        int min = num1<num2?num1:num2;
        for (int i = min;i>=1;i--){
            if (num1%i==0 && num2 % i==0){
                System.out.println("最大公约数为："+i);
                break;
            }
        }
//        ------------最小公倍数--------------
        int max = Math.max(num1, num2);
        for (int i=max;i<=num1*num2;i++){
            if (i%num1==0 && i%num2==0){
                System.out.println("最小公倍数为："+i);
                break;
            }
        }

    }
}
