package com.my.package3;

/*
* 对象数组题目：
* 定义类 Student，包含三个属性：学号 number（int），年级 state（int），成绩 score（int）。
* 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
* 问题一：打印出3年级（ state值为3）的学生信息。
* 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
*
* 提示：
* 生成随机数：Math. random（），返回值类型doub1e
* 四舍五入取整：Math, round（ double d），返回值类型1ong。
* */
public class demo2 {
    /**
     * 遍历数组
     * @param arrs：需要遍历的数组
     */
    private void printall(Student[] arrs){
        for (int i =0;i<arrs.length;i++){
            arrs[i].printinfo();
        }
    }

    /**
     *查抄
     * @param arrs:查找的数组
     * @param state：需要查找的年纪
     */
    private void search(Student[] arrs,int state){
        for (int i=0;i<arrs.length;i++){
            if (arrs[i].state==3){
                arrs[i].printinfo();
            }
        }
    }

    /**
     *排序
     * @param arrs：需要排序的数组
     */
    private void sort(Student[] arrs){
        for (int i=0;i<arrs.length-1;i++){
            for (int j=0;j<arrs.length-1-i;j++){
                if (arrs[j].score>arrs[j+1].score){
                    Student tmp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for (int i =0;i<stus.length;i++){
            stus[i] = new Student();
            stus[i].number = i+1;
            stus[i].state = (int) (Math.random()*6+1);//state:[1,6]
            stus[i].score = (int) (Math.random()*101);//score:[0,100]
        }

        demo2 test = new demo2();
        test.printall(stus);
        System.out.println("-----------------------------------");
        test.search(stus,3);
        test.sort(stus);
        System.out.println("-----------------------------------");
        test.printall(stus);
    }
}

class Student{
    public int number,state,score;
    public void printinfo(){
        System.out.println("学号："+number+"\t年级"+state+"\t成绩："+score);
    }
}
