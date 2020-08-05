package com.my.package4;

import java.util.Scanner;
import java.util.Vector;

/*
利用 ector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
而向量类java.uti1.Vector可以根据需要动态伸缩创建 vector对象：Vector v= new Vector（）
给向量添加元素：V.addElement(Object obj)
//obj必须是对象取出向量中的元素， object obj=v.elementAt（a）；注意第一个元素的下标是0，返回值是object类型的。
计算向量的长度：V.size（）；若与最高分相差10分内：A等；20分内：B等；
30分内：C等；其它：D等
* */
public class demo7 {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Vector v = new Vector();
        boolean isflag = true;
        while (isflag){
            int score = scan.nextInt();
            if (score>=0 && score<=100){
                v.addElement(score);//自动装箱、多态
            }else {
                isflag = false;
            }
        }
//        System.out.println(v.size());
        demo7 d = new demo7();
        System.out.println("最高分为："+ d.findmax(v));
        System.out.println("**************************");
        d.getscore(v, d.findmax(v));

    }
    public int findmax(Vector v){
        int maxscore = 0;
        for (int i=0;i<v.size();i++){
            int num1 = (Integer) v.elementAt(i);
            maxscore = Math.max(maxscore,num1);
        }
        return maxscore;
    }
    public void getscore(Vector v,int max){

        for (int i = 0;i<v.size();i++){
            int diff = max - (Integer) v.elementAt(i);//向下转型、自动拆箱
            if (diff <= 10 ){
                System.out.println(v.elementAt(i)+"对应的分数等级为‘A’");
            }else if (diff <= 20){
                System.out.println(v.elementAt(i)+"对应的分数等级为‘B’");
            }else if (diff <= 30){
                System.out.println(v.elementAt(i)+"对应的分数等级为‘C’");
            }else {
                System.out.println(v.elementAt(i)+"对应的分数等级为‘D’");
            }

        }
    }
}
