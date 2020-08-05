package com.my.package15;

import java.io.File;

/*
* File的基本使用方法（文件夹）
* */
public class demo2 {
    public static void main(String[]args){
//        File dir = new File("src/com/my/package15/dir1/dir2/dir3/");
//        boolean flag = dir.mkdir();//创建文件夹
//        boolean flag2 = dir.mkdirs();//创建文件夹及其父文件夹（多层文件夹）
//        System.out.println("创建文件夹是否成功："+flag);
//        System.out.println("创建多层文件夹是否成功："+flag2);
//
//        //删除文件路径最后一个文件夹
//        boolean del = dir.delete();
//        System.out.println("删除文件夹是否成功："+del);

        File f = new File("F:\\java教学\\Java从入门到精通（第5版）\\15\\");
        File files[] = f.listFiles();//返回文件夹下所有的子文件及子文件夹
        for (File tmp:files){
            if (tmp.isFile()){//判断是否为文件
                System.out.println("文件："+tmp.getName());
            }else if (tmp.isDirectory()){//判断是否为文件夹
                System.out.println("文件夹："+tmp.getName());
            }
        }


    }
}
