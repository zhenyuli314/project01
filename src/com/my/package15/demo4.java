package com.my.package15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
* 字符流FileWriter和FileReader的基本使用
* */
public class demo4 {
    public static void main(String[]args){
        File f = new File("src/com/my/package15/word.txt");//创建File对象并实例化
//        FileWriter fw = null;//创建空的FileWriter对象
//        try {
//            fw = new FileWriter(f);//实例化FileWriter对象
//            String str = "自强不息，厚德载物";
//            fw.write(str);//写入字符串
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (fw!=null){
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }



        FileReader fr = null;//创建空的FileReader对象
        try {
            fr = new FileReader(f);//实例化FileReader对象
            char ch[] = new char[1024];//缓冲区
            int count;//已经读出的字符数

//            count = fr.read(ch);
//            System.out.println(new String(ch,0,count));
            while ((count=fr.read(ch))!=-1){//循环读取文件中的数据，直到所有字符都读完
                System.out.println(new String(ch,0,count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
