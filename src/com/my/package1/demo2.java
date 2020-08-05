package com.my.package1;
//三元运算基本使用
public class demo2 {
    public static void main(String[]args){
        char ch = 'a';
        int num = 0 ;
        boolean bool = true;
        System.out.println( bool ? ch : 100);
        System.out.print( !bool ? num : ch);
    }
}
