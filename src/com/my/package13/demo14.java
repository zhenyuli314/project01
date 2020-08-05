package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 复选框JCheckBox的基本使用
* */
public class demo14 extends JFrame {
    public demo14(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setTitle("复选框的基本使用");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());             //设置流布局
        JCheckBox b1 = new JCheckBox("option1");//添加复选框
        JCheckBox b2 = new JCheckBox("option2");
        JCheckBox b3 = new JCheckBox("option3");
//        ButtonGroup bb = new ButtonGroup();    //JRadioButton的按钮组ButtonGroup也可用于JCheckBox复选框的限制单选
//        bb.add(b1);
//        bb.add(b2);
//        bb.add(b3);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        b1.setSelected(true);   //使用setSelected设置默认选中b1

        JButton btn = new JButton("print");//创建按钮打印选中状态
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(b1.getText()+"的选中状态为:  "+b1.isSelected()); //使用isSelected返回选中状态
                System.out.println(b2.getText()+"的选中状态为:  "+b2.isSelected());
                System.out.println(b3.getText()+"的选中状态为:  "+b3.isSelected());
//                bb.clearSelection();
            }
        });

        setVisible(true);
    }
    public static void main(String[]args){
        new demo14();
    }
}
