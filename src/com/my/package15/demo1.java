package com.my.package15;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* File的基本使用方法（文件）
* 项目下文件的路径（默认路径）：word.txt
* 包中的文件路径：src/com/my/package15/word.txt
* 注意：/ 或 \\ 来表示路径
* 绝对路径：c:/test/word.txt
* */
public class demo1 {
    public static void main(String[]args){
        File f1 = new File("src/com/my/package15/word.txt");
        System.out.println("文件是否存在："+f1.exists());
        System.out.println("输出文件名："+f1.getName());
        System.out.println("文件的绝对路径："+f1.getAbsolutePath());
        System.out.println("是否隐藏文件："+f1.isHidden());
        System.out.println("输出文件大小，单位：字节："+f1.length());

        Date date = new Date(f1.lastModified());//日期类格式化文件最后修改的时间
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//再次修改时间格式
        System.out.println("文件最后修改日期："+sdt.format(date));

        boolean del = f1.delete();
        System.out.println("删除文件是否成功："+del);

        try {
            boolean create = f1.createNewFile();//不会覆盖旧的文件,也不会生成两个文件
            System.out.println("文件创建是否成功："+create);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
