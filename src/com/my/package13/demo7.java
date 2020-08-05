package com.my.package13;

import javax.swing.*;
import java.awt.*;
/*
* BorderLayout 边界布局基本方法，使用add添加控件时指定方位，默认为中间
* */
public class demo7 extends JFrame {
    public demo7(){
        setBounds(300,400,600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("边界布局控件基本方法");

        Container f = getContentPane();
        f.setLayout(new BorderLayout());
        JButton b1 = new JButton("中");
        JButton b2 = new JButton("东");
        JButton b3 = new JButton("南");
        JButton b4 = new JButton("西");
        JButton b5 = new JButton("北");
        f.add(b1,BorderLayout.CENTER);
        f.add(b2,BorderLayout.EAST);
        f.add(b3,BorderLayout.SOUTH);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.NORTH);


        setVisible(true);
    }
    public static void main(String[]args){
        new demo7();
    }
}
