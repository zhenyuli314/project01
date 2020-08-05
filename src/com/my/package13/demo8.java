package com.my.package13;

import javax.swing.*;
import java.awt.*;

/*
* GridLayout 网格布局基本方法
* */
public class demo8 extends JFrame {
    public demo8(){
        setBounds(300,400,600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("网格布局基本方法");

        Container f = getContentPane();
        f.setLayout(new GridLayout(5,5));
        for (int i = 0;i<10;i++){
            f.add(new JButton("button"+i));
        }

        setVisible(true);
    }
    public static void main(String[]args){
        new demo8();
    }
}
