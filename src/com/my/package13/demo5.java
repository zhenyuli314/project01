package com.my.package13;

import javax.swing.*;
import java.awt.*;
/*
* 绝对布局layout基本用法
* */
public class demo5 extends JFrame {
    public demo5(){
        setBounds(300,400,800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("控件的绝对布局方法");
        Container f = getContentPane();
        setVisible(true);

        f.setLayout(null);
        JButton b1 = new JButton("button1");
        JButton b2 = new JButton("button2");
        b1.setBounds(100,200,100,20);
        b2.setBounds(100,300,100,20);
        f.add(b1);
        f.add(b2);
    }
    public static void main(String[]args){
        new demo5();
    }
}
