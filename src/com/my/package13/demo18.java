package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 密码框JPasswordField的基本使用
* */
public class demo18 extends JFrame {
    public demo18(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("密码框的基本使用");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JPasswordField pwd = new JPasswordField();
        pwd.setColumns(20);
        pwd.setFont(new Font("黑体",Font.BOLD,20));
        pwd.setEchoChar('*');
        c.add(pwd);

        pwd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] ch = pwd.getPassword();
                String item = new String(ch);
                System.out.println(item);
            }
        });

        JButton btn =new JButton("确认");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] ch = pwd.getPassword();
                String item = new String(ch);
                System.out.println(item);
            }
        });
        c.add(btn);

        setVisible(true);
    }
    public static void main(String[]args){
        new demo18();
    }
}
