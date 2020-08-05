package com.my.package13;

import javax.swing.*;
import java.awt.*;
/*
* JFrame基本用法
* */
public class demo1 extends JFrame{
    public demo1(){
        setVisible(true);
        setTitle("窗口标题");
        /*窗体关闭规则
         * EXIT_ON_CLOSE
         * DO_NOTHING_CLOSE
         *
         * */
//        f1.setSize(300,200);//窗体大小
//        f1.setLocation(200,200);//窗体位置
        setBounds(200,200,300,200);//设置位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口，并停止程序
        Container c = getContentPane(); //创建窗体内的容器
        c.setBackground(Color.WHITE);//设置容器背景颜色
        JLabel l = new JLabel("这是一个窗体");//组件对象
        c.add(l);//添加组件
//        c.remove(l);
        c.validate();//验证容器中的组件 即刷新
        setContentPane(c);//窗体重新载入容器，起到刷新的作用
        setResizable(false);//设置窗体不可以改变大小
        System.out.println("x= "+getX());//获取坐标
    }
    public static void main(String[]args){
        new demo1();
            }

}