package com.my.package13;

import javax.swing.*;
import java.awt.*;

/*
* FlowLayout流布局布局方式
* 控件从左到右，默认居中对齐（像水一样，向某个方向流动，遇到障碍就折回）
* */
public class demo6 extends JFrame {
    public demo6(){
        setBounds(300,400,800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("流布局控件基本用法");
        Container f = getContentPane();

        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        for(int i=0;i<10;i++){
            f.add(new Button("button"+i));
        }

        setVisible(true);
    }
    public static void main(String[]args){
        new demo6();
    }
}
