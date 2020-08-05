package com.my.package13;

import javax.swing.*;
import java.awt.*;

public class demo19 extends JFrame {
    public demo19() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JTextArea文本域的基本使用");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextArea taa = new JTextArea();
        taa.setText("这是文本域");
        taa.setColumns(20);
        taa.setRows(20);
        taa.setFont(new Font("楷体", Font.BOLD, 20));
        taa.append("追加内容");
        taa.insert(" 插入内容的 ",2);


        JScrollPane s = new JScrollPane(taa);
        c.add(s);

        setVisible(true);
    }

    public static void main(String[] args) {
        new demo19();
    }
}
