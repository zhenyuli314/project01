package com.my.package1;

import java.util.Scanner;

/*
 * 家庭收支演示软件
 * */
public class test1 {
    public static Scanner scan = new Scanner(System.in);

    public static int readToken() {
        String token;
        int num;
        for (; ; ) {
            token = scan.next();
            try {
                num = Integer.parseInt(token);
                if (num != 1 && num != 2 && num != 3 && num != 4) {
                    System.out.println("输入错误，请输入1-4");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("输入错误，请输入1-4");

            }

        }
        return num;
    }

    public static char getExit() {
        char isflag;
        for (; ; ) {
            String token = scan.next().toUpperCase();
            isflag = token.charAt(0);
            if (isflag != 'Y' && isflag != 'N') {
                System.out.println("输入错误,请输入y或n");
            } else {
                break;
            }
        }
        return isflag;

    }

    public static int readNumber() {
        int number;
        for (; ; ) {
            String str = scan.next();
            try {
                number = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入有误，请重新输入");
            }
        }
        return number;
    }

    public static String readInfo() {
        String str = scan.next();
        return str;
    }

    public static void main(String[] args) {
        boolean isflag = true;
        String details = "";
        int balance = 10000;
        while (isflag) {
            System.out.println("----------家庭收支记账软件----------\n");
            System.out.println("          1 收支明细");
            System.out.println("          2 登记收入");
            System.out.println("          3 登记支出");
            System.out.println("          4 退   出\n");
            System.out.println("          请选择M<1-4>:");
            int token = readToken();
            switch (token) {
                case 1:
                    System.out.println("----------当前收支明细记录----------");
                    System.out.println("收支\t账户金额\t\t收支金额\t\t说  明");
                    System.out.println(details);
                    System.out.println("---------------------------------");
                    break;
                case 2:
//                    System.out.println("登记收入");
                    System.out.println("本次收入金额：");
                    int get = readNumber();
                    System.out.println("本次收入说明：");
                    String info_get = readInfo();

                    balance += get;
                    details += ("收入\t" + balance + "\t\t" + get + "\t\t" + info_get + "\n");
                    System.out.println("------------记账完成---------------");
                    break;
                case 3:
//                    System.out.println("登记支出");
                    System.out.println("本次支出金额：");
                    int out = readNumber();
                    System.out.println("本次支出说明：");
                    String info_out = readInfo();


                    balance -= out;
                    if (balance < 0) {
                        System.out.println("余额不足,请重新输入");
                    } else {
                        details += ("支出\t" + balance + "\t\t" + out + "\t\t" + info_out + "\n");
                    }


                    System.out.println("------------记账完成---------------");
                    break;
                case 4:
                    System.out.println("是否确认退出<y/n>");
                    char y_or_n = getExit();
                    if (y_or_n == 'Y') {
                        isflag = false;
                    }
            }
        }
    }

}
