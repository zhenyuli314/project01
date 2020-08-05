package com.my.package13;

import javax.swing.*;
import java.awt.*;

/*
 * GridBagLayout 网格包控件基本用法
 * */
public class demo9 {
    JFrame J = new JFrame();
    Container C;

    public void creat() {
        C = J.getContentPane();
        J.setSize(800, 600);           //*****
        J.setLocationRelativeTo(null);          //******
        J.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        J.setTitle("GridBagLayout的基本使用方法");
        C.setLayout(new GridBagLayout());
    }

    void creat2(){
        for (int i=0;i<10;i++){
            GridBagConstraints g1 = new GridBagConstraints();
            g1.gridx = 0;
            g1.gridy = i;
            C.add(new JButton("button"),g1);

            GridBagConstraints g2 = new GridBagConstraints();
            g2.gridx = i;
            g2.gridy = 0;
            C.add(new JButton("button"),g2);


        }
    }

    void init() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        g1.gridwidth = 2;
        g1.gridheight = 2;
        g1.weightx = 80;
        g1.weighty = 60;
        g1.anchor = GridBagConstraints.CENTER;
//        g1.fill = GridBagConstraints.VERTICAL;
        C.add(new JButton("Button1"), g1);


        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 3;
        g2.gridy = 1;
        g2.gridwidth = 4;
        g2.gridheight = 2;
        g2.fill = GridBagConstraints.HORIZONTAL;
        g2.insets = new Insets(10,20,10,20);
        C.add(new JButton("Button2"), g2);


        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 7;
        g3.gridy = 1;
        g3.gridwidth = 2;
        g3.gridheight = 2;
//        g3.fill = GridBagConstraints.BOTH;
        g3.ipadx = 20;
        g3.ipady = 10;
        C.add(new JButton("Button3"), g3);


        J.setVisible(true);
    }

    public static void main(String[] args) {
        demo9 demo9 = new demo9();
        demo9.creat();
        demo9.creat2();
        demo9.init();
    }
}

