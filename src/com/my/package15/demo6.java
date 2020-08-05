package com.my.package15;

import java.io.*;

/*
* 输出缓冲字节流BufferedOutputstream基本用法
* write后加flush用于强制送走数据
* */
public class demo6 {
    public static void main(String[]args){
        File f = new File("src/com/my/package15/word.txt");
        BufferedOutputStream bo =null;//创建缓冲器对象
        FileOutputStream fo = null;//创建输出文件字节流对象
        try {
            fo = new FileOutputStream(f);//实例化输出字节流对象
            bo = new BufferedOutputStream(fo);//包装文件输出流
            String str = "车到山前必有路,柳暗花明又一村";
            byte byt[] = str.getBytes();//获取字符串的字节数组
            bo.write(byt);
            //使用缓冲字节输出流时，要多进行刷新操作
            bo.flush();//刷新。强制将缓冲区数据写入文件中，即缓冲区没有写满
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fo!=null){
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bo!=null){
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
