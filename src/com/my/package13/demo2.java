package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* JDialog对话窗口基本用法
* */
public class demo2 extends JDialog {


    public demo2(JFrame owner) {
        /*
        * 第一个参数：父窗体对象
        * 第二个参数：对话框标题
        * 第三个参数：是否阻塞
        * */
        super(owner, "对话窗口", true);//父类方法
        Container f = getContentPane();
        f.add(new JLabel("对话窗体"));


        setSize( 300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        JFrame s = new JFrame("窗口主题");//创建Frame窗体
        Container s1 = s.getContentPane();//创建容器
        JButton btn = new JButton("登录入口");

        s1.setLayout(new FlowLayout());//在容器中设置布局
        s1.add(btn);

        //设置窗体位置大小、可见、关闭方式
        s.setSize(500,600);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() { //为按钮添加Action
            @Override
            public void actionPerformed(ActionEvent e) {
                new demo2(s);
            }
        });
    }
}
