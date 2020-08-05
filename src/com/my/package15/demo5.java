package com.my.package15;

import java.io.*;

/*
* 缓冲字节输入流BufferedInputStream,用于提高运行效率。
* */
public class demo5 {
    public static void main(String[]args){
        File f =new File("D:\\JDK14\\jdk api 1.8_google.CHM");//创建File对象并实例化
        long time_start = System.currentTimeMillis();//获取当前时间为开始节点
        BufferedInputStream bi = null;//创建缓冲器对象,大大提高了运行效率
        FileInputStream fi = null;//创建字节输入流对象
        try {
            fi = new FileInputStream(f);//实例化字节输入流对象
            bi = new BufferedInputStream(fi);//实例化缓冲器对象
            byte byt[] = new byte[1024];//缓冲区字节数组（和Buffered不同）
            while ((bi.read(byt))!=-1){//使用缓冲器读取数据到byte数组
                //System.out.println("qqqqq");
            }
            long time_end = System.currentTimeMillis();//获取当前时间为结束节点
            System.out.println("读取文件用时："+(time_end-time_start));//计算时间差
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fi!=null){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bi!=null){
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
