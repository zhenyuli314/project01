package com.my.package15;
/*
* 数据输入输出流DataInputStream和DataOutputStream基本用法
* 用于向输入输出流中写入和读出数据。
* 数字隔行，负责数据会出错
*/

import java.io.*;

public class demo8 {
    public static void main(String[]args){
        File f = new File("src/com/my/package15/word.txt");
        FileOutputStream fo = null;
        DataOutputStream dos = null;
        try {
//            String str = "写入文件的字符串";
            fo = new FileOutputStream(f);
//            byte byt[] = str.getBytes();
//            fo.write(byt);

            dos = new DataOutputStream(fo);//将“文件”流打包成“数据”流！！！！
            dos.writeUTF("写入流的字符串");//写入字符串数据
            dos.writeInt(100);//写入整型数据
            dos.writeBoolean(true);//写入浮点型数据
            dos.writeDouble(11.11);//写入布尔型数据
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos!=null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fo!=null){
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileInputStream fi = null;
        DataInputStream dis = null;
        try {
            fi = new FileInputStream(f);
//            byte[] byt2 = new byte[1024];
//            int count = fi.read(byt2);
//            System.out.println(new String (byt2,0,count));

            dis = new DataInputStream(fi);//将“文件”流打包成“数据”流！！！！
            System.out.println(dis.readUTF());//UTF是双字节编码，而writeChars方法写入的是按照字符格式写入的，在文件中的占位要小于以Unicode编码的同样字符串，所以，使用readUTF方法读取时，会出现EOF错误
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dis!=null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fi!=null){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
