package com.my.package13;

import javax.swing.*;
import java.awt.*;
/*
* Jlabel标签基本用法
* */
public class demo3 extends JFrame {
    public demo3(){
        setBounds(500,500,500,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame窗体");
        Container f =  getContentPane();        //获取窗体内容器
        setVisible(true);

        JLabel j = new JLabel("这是一个标签");
        j.setFont(new Font("楷体",Font.BOLD,15));
        j.setForeground(Color.RED);
        f.add(j);

    }
    public static void main(String[]args){
        new demo3();
    }
}
