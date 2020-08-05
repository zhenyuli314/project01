package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 按钮组件的基本使用
* */
public class demo12 extends JFrame {
    public demo12(){
        setSize(800,600);           //设置窗体大小
        setLocationRelativeTo(null);            //将窗体显示在屏幕中央
        setTitle("按钮组件的基本使用");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //设置窗体关闭方式

        Container c = getContentPane();             //获取窗体内容器
        c.setLayout(new GridLayout(3,2,10,5));  //容器布局为3*2的网格布局

        JButton[] btn = new JButton[6];             //创建按钮类型的列表（空列表，起到占位作用）
        for (int i=0;i<btn.length;i++){             //循环添加按钮
            btn[i] = new JButton();                 //为空按钮组索引创建按钮
            c.add(btn[i]);
        }

        btn[0].setText("不可用");
        btn[0].setEnabled(false);           //设置按钮为不可用

        btn[1].setText("有背景色");
        btn[1].setBackground(Color.GREEN);

        btn[2].setText("无边框");
        btn[2].setBorderPainted(false);     //设置按钮无边框

        btn[3].setText("有边框");
        btn[3].setBorder(BorderFactory.createLineBorder(Color.YELLOW));

        Icon icon = new ImageIcon("F:\\javaproject\\src\\com\\my\\package13/0.jpg");
        btn[4].setIcon(icon);
        btn[4].setToolTipText("点击按钮");

        btn[5].setText("点击事件");
        btn[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(demo12.this,"点击事件");

            }
        });

        setVisible(true);                           //显示窗体
    }

    public static void main(String[]args){
        new demo12();
    }
}
