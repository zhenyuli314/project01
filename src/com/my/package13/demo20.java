package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/*
* addFocusListener焦点事件监听器
* */
public class demo20 extends JFrame {
    public demo20(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("焦点事件监听器");

        Container c = getContentPane();
        c.setLayout(new FlowLayout(10));
        JTextField jt1 = new JTextField();
        jt1.setColumns(40);
        JTextField jt2 = new JTextField();
        jt2.setColumns(40);
        JTextField jt3 = new JTextField();
        jt3.setColumns(40);
        JLabel jl1 = new JLabel("文本1");
        JLabel jl2 = new JLabel("文本2");
        JLabel jl3 = new JLabel("文本3");
        c.add(jt1);
        c.add(jl1);
        c.add(jt2);
        c.add(jl2);
        c.add(jt3);
        c.add(jl3);



        class MyFocusListener implements FocusListener{ //通过焦点监听器接口，创建自己的监听成员内部类（单个可使用匿名内部类）

            @Override
            public void focusGained(FocusEvent e) {
                JTextField tmp =(JTextField) e.getSource();       //获取发出监听的组件
                tmp.setBorder(BorderFactory.createLineBorder(Color.green));//给获取焦点的文本框设置绿色边框

            }

            @Override
            public void focusLost(FocusEvent e) {
                JTextField tmp = (JTextField) e.getSource();
                tmp.setBorder(BorderFactory.createLineBorder(Color.RED));//给失去焦点的文本框设置红色边框
            }
        }

        jt1.addFocusListener(new MyFocusListener());//使用自定义
        jt2.addFocusListener(new MyFocusListener());
        jt3.addFocusListener(new MyFocusListener());

        setVisible(true);
    }
    public static void main(String[]args){
        new demo20();
    }
}
