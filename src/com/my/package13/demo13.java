package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* JRadioButton单选按钮的基本使用
* */
public class demo13 extends JFrame {
    public demo13(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setTitle("JRadioBUtton单选按钮的基本使用");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JRadioButton b1= new JRadioButton("向左走");           //创建单选按钮
        JRadioButton b2=new JRadioButton("向右走");

        ButtonGroup group = new ButtonGroup();                      //创建按钮组 用于限制单选
        group.add(b1);
        group.add(b2);

        c.add(b1);
        c.add(b2);

        b1.setSelected(true);                                       //设置b1为默认选中

        JButton btn = new JButton("打印");                    //创建打印按钮打印选中状态
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(b1.getText()+"按钮选中状态为： "+b1.isSelected());
                System.out.println(b2.getText()+"按钮选中状态为： "+b2.isSelected());
                group.clearSelection();                             //打印后，使用group按钮组清空当前选中状态
            }
        });

        setVisible(true);
    }
    public static void main(String[]args){
        new demo13();
    }
}
