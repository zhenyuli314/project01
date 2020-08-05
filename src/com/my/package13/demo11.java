package com.my.package13;

import javax.swing.*;
import java.awt.*;
/*
* JScroPane滚动面板的使用
* */
public class demo11 extends JFrame {
    public demo11(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setTitle("JScroPane滚动面板的基本使用");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = getContentPane();
        JTextArea t = new JTextArea();
        JScrollPane js = new JScrollPane(t);
        c.add(js);

        setVisible(true);
    }
    public static void main(String[]args){
        new demo11();
    }
}
