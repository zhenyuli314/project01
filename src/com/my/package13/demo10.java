package com.my.package13;

import javax.swing.*;
import java.awt.*;

/*
 *  使用JPanel创建多面板布局
 * */
public class demo10 extends JFrame {
    public demo10() {
        JFrame j = new JFrame();
        j.setSize(800, 600);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setTitle("JPanel基本用法");

        Container c = j.getContentPane();                   //获取窗体容器
        c.setLayout(new GridLayout(2, 2));        //容器布局为2*2的网格布局

        JPanel p1 = new JPanel();                           //创建面板
        p1.setLayout(new BorderLayout());
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 3));
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(2, 1));
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(2, 2));
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);

        p1.setBorder(BorderFactory.createTitledBorder("p1"));//设置边框
        p2.setBorder(BorderFactory.createTitledBorder("p2"));
        p3.setBorder(BorderFactory.createTitledBorder("p3"));
        p4.setBorder(BorderFactory.createTitledBorder("p4"));

        p1.add(new JButton("button1"), BorderLayout.NORTH);
        p1.add(new JButton("button2"), BorderLayout.SOUTH);
        p1.add(new JButton("button3"), BorderLayout.CENTER);
        p1.add(new JButton("button4"), BorderLayout.WEST);
        p1.add(new JButton("button5"), BorderLayout.EAST);

        for (int i = 0; i < 3; i++) {
            p2.add(new JButton("button" + i));
        }
        for (int i = 0; i < 2; i++) {
            p3.add(new JButton("button" + i));
        }
        for (int i = 0; i < 4; i++) {
            p4.add(new JButton("button" + i));
        }


        j.setVisible(true);
    }

    public static void main(String[] args) {
        new demo10();
    }
}
