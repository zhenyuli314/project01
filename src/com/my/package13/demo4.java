package com.my.package13;

import javax.swing.*;
import java.awt.*;

/*
* 使用Jlabel添加图像的基本用法
* */
public class demo4 extends JFrame {
    public demo4(){
        setBounds(400,300,400,300);
        setTitle("使用Jlabel加载图像");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container f = getContentPane();//获取窗体内容器
        setVisible(true);

        JLabel j= new JLabel("这是加载图像的label");
        Icon icon = new ImageIcon("F:\\javaproject\\src\\com\\my\\package13/0.jpg");
        j.setIcon(icon);
        f.add(j);
    }
    public static void main(String[]args){
        new demo4();
    }
}
