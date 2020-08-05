package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 下拉框JComboBox的基本使用
* */
public class demo15 extends JFrame {
    public demo15(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JCcomboBox下拉框的基本使用");

        Container c = getContentPane();
        c.setLayout(null);   //使用绝对布局方法
        /*添加方法一：*/
//        JComboBox<String> cbx = new JComboBox<>();   //创建JComboBox下拉列表框
//        cbx.addItem("身份证");                         //添加下拉框的列表元素
//        cbx.addItem("学生证");
//        cbx.addItem("军人证");

        /*添加方法二：*/
//        String items[] ={"身份证","学生证","军人证"};      //创建下拉框中的元素列表
//        JComboBox<String> cbx = new JComboBox<>(items); //创建JComboBox下拉列表框并添加元素列表

        /*添加方法三：*/
        JComboBox<String> cbx = new JComboBox<>();
        String items[] = {"身份证","学生证","军人证"};
        ComboBoxModel<String> cm= new DefaultComboBoxModel<>(items);//创建下拉列表模型
        cbx.setModel(cm);                                    //向列表中添加数据模型

        cbx.setBounds(50,50,100,20);
        cbx.setEditable(true);

        c.add(cbx);

        JButton btn = new JButton("print");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中索引："+cbx.getSelectedIndex());
                System.out.println("选中内容："+cbx.getSelectedItem());
            }
        });
        btn.setBounds(180,50,60,20);
        c.add(btn);

        setVisible(true);
    }
    public static void main(String[]args){
        new demo15();
    }
}

