package com.my.package5;
/*
* main()方法的使用说明：
* 1.main()方法作为程序的入口
* 2.main()方法也是一个普通的静态方法
* 3.main()方法可以作为我们与控制台交互的方式
* */
public class demo4 {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
