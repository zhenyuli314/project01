package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 文本框JTextField的基本使用
* */
public class demo17 extends JFrame {
    public demo17() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("文本框的基本使用");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextField tfe = new JTextField();
        tfe.setColumns(20);         //设置文本框长度
        tfe.setText("默认内容");        //设置初始值
        tfe.setFont(new java.awt.Font("楷体",java.awt.Font.BOLD,15));//设置字体，加粗、字号大小
//        tfe.setFont(new java.awt.Font("楷体", java.awt.Font.BOLD,15));
        Component add = c.add(tfe);

        JButton btn = new JButton("print");
        JButton btn2 = new JButton("clean");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tfe.getText());  //获取文本框内容
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfe.setText("");             //清空文本框
                tfe.requestFocus();         //光标复位
                btn2.setToolTipText("清除按钮");//鼠标悬停信息提示
            }
        });
        c.add(btn);
        c.add(btn2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new demo17();
    }
}
