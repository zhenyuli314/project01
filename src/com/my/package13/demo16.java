package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/*
 * 列表框JList的基本使用
 * */
public class demo16 extends JFrame {
    public demo16() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("列表框的基本使用");

        Container c = getContentPane();
        c.setLayout(null); //绝对布局方式

        String items[] = {"元素1", "元素2", "元素3", "元素4", "元素5", "元素6", "元素7", "元素8", "元素9", "元素10", "元素11", "元素12", "元素13", "元素14", "元素15"};
        /*添加方法一：*/
//        JList<String> lst = new JList(items);  //创建列表框并添加元素

        /*添加方法二：*/
        JList<String> lst = new JList<>(); //创建列表框
        DefaultListModel<String> model = new DefaultListModel<>();//创建列表框的数据模型
        for (String tmp:items){         //添加元素
            model.addElement(tmp);
        }
        model.addElement("李聪");     //后期可以改动列表元素
        lst.setModel(model);            //列表载入数据模型

//        lst.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //相邻选
        lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //设置选择方式：多选
//        lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);    //单选
        c.add(lst);

        JScrollPane js = new JScrollPane(lst);              // 为列表框添加滑动窗口，即滑动条
        js.setBounds(300, 200, 100, 120);//通过调整滑动窗大小调整以添加滑动窗口后的列表框大小
        c.add(js);

        JButton btn =new JButton("print");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> list = lst.getSelectedValuesList();//选中的列表框元素信息，返回类型为列表
                for (String tmp:list){
                    System.out.println(tmp);   //打印列表元素
                }
                System.out.println("-------end---------");

            }
        });
        btn.setBounds(450,250,60,20);
        c.add(btn);

        setVisible(true);

    }

    public static void main(String[] args) {
        new demo16();
    }
}
