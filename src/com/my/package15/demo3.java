package com.my.package15;

import java.io.*;

/*
* 字节输入输出流
* FileOutputStream
* FileInputStream
* */
public class demo3 {
    public static void main(String[]args){
        File f = new File("src/com/my/package15/word2.txt");//实例化File对象
        try {
            FileOutputStream out = new FileOutputStream(f,false);//文件输出流，true可追加内容，默认为false为覆盖原内容
            String str = "你见过洛杉矶凌晨四点的样子吗？";
            byte b[] = str.getBytes();//字符串转换为字节数组
            out.write(b);//将字节数组中数据写入到文件当中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(f);//输入流读文件
            byte b2[] =new byte[1024];
            int len = in.read(b2);//将输入流读到的数据存至byte数组中，返回int型数据长度
            System.out.println(new String(b2,0,len));//将byte数组中的字节数据转为字符串。只打印数据长度的内容，不打印空格
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
