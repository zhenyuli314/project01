package com.my.package1;
/*
* 打印所有的水仙花数，所谓的水仙花数是指一个3位数，各个位上的数字的立方和等于其本身
* eg：153 = 1*1*1 + 3*3*3 +5*5*5
* 使用了Math.pow(num,3)求立方
* */
public class demo4 {
    public static void main(String[] args) {
        for (int i =100;i<1000;i++){
            int num_100 = i/100;
            int num_10 = i/10%10;
            int num_1 = i%10;
            int sum_100 = (int) Math.pow(num_100,3);
            int sum_10 = (int) Math.pow(num_10,3);
            int sum_1 = (int) Math.pow(num_1,3);
            if (i == sum_100+sum_10+sum_1 ){
                System.out.println("水仙花数有："+i);
            }
        }
    }
}
