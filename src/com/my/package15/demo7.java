package com.my.package15;

import java.io.*;

/*
* 缓冲字符流BufferedReader和BufferedWriter基本用法
* 可以包装字符流以提高效率
* BufferedWriter的newline方法可以添加新的一行（空白行，相当于回车）
* BufferedReader的readline方法可以逐行读取内容
* 要注意流的关闭顺序，先创建的后关闭
* */
public class demo7 {
    public static void main(String[]args){
        File f = new File("src/com/my/package15/word.txt");
//        FileWriter fw = null;
//        BufferedWriter bf = null;
//        try {
//            fw = new FileWriter(f);
//            bf = new BufferedWriter(fw);//将文件字符输出流包装为缓冲字符流
//            String str1 ="会当凌绝顶，";
//            String str2 ="一览众山小。";
//            String str3 ="333";
//
//            bf.write(str1);//写入第一行数据
//            bf.newLine();//创建一个新行（第二行）
//            bf.write(str2);//写入第二行数据
//            bf.newLine();//创建一个新行（第三行）
//            bf.write(str3);//写入第三行数据
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {//要注意流的关闭顺序，先创建的后关闭
//            if (bf!=null){
//                try {
//                    bf.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fw!=null){
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);//将文件字符输入流包装成缓冲字符输入流
            String tmp;
            while ((tmp=br.readLine())!=null){//循环读取文件中内容
                System.out.println(tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
