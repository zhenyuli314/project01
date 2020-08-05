package com.my.package2;

import java.util.Scanner;

/*
 * 从键盘读入学生成绩，找出最高分，并输出成绩等级。
 * 成绩>=最高分-10 等级为‘A’
 * 成绩>=最高分-20 等级为‘B’
 * 成绩>=最高分-30 等级为‘C’
 * 其余  等级为'D'
 *
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩
 * */
public class demo2 {
    public static char degree(int max,int score){
        int diff = max-score;
        char token = 'D';
        if (diff<10){
            token =  'A';
        }else if (diff>10&&diff<20){
            token = 'B';
        }else if (diff>20&&diff<30){
            token =  'C';
        }else {
            token = 'D';
        }
        return token;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num = scan.nextInt();

        String[] names = new String[num];
        int[] score = new int[num];
        char[] degree = new char[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + i+1 + "个学生的姓名：");
            names[i] = scan.next();
            System.out.println("请输入第" + i+1 + "个学生的成绩：");
            try {
                score[i] = Integer.parseInt(scan.next());
                if (score[i] < 0 && score[i] > 100) {
                    System.out.println("请输入0-100以内的成绩");
                }
            } catch (Exception e) {
                System.out.println("请输入0-100以内的成绩");
            }
        }

        int maxscore = 0;
        for (int i = 0; i < score.length-1; i++){
                maxscore = Math.max(score[i],score[i+1]);
        }
        for (int i=0;i<names.length;i++){
            degree[i] = degree(maxscore,score[i]);
            if (score[i]==maxscore){
                System.out.println("姓名："+names[i]+"\t成绩:"+score[i]+"\t等级："+degree[i]+"\t是否最高分：是");
            }else {
                System.out.println("姓名："+names[i]+"\t成绩:"+score[i]+"\t等级："+degree[i]+"\t是否最高分：否");
            }
        }
    }
}
