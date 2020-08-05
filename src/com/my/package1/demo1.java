package com.my.package1;

import java.util.Scanner;
/*
* switch case 练习
* */
public class demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char token = word.charAt(0);
        System.out.println("写入的单词为：" + token);
        switch (token) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            default:
                System.out.println("other");
        }
    }
}
