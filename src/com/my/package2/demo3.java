package com.my.package2;
/*二维数组的使用
 * 数组的长度一旦确定，就能修改。
 * 、基本数据类型元素的数组、引用数据类型元素的数组（string、Array、interface）
 * 二维数组的声明和初始化
 * 如何调用数组的指定位置的元素
 * 如何获取数组的长度
 * 如何遍历数组
 * 数组元素的默认初始值
 * 数组的内存解析
 * */
public class demo3 {
    public static void main(String[] args) {
        //静态初始化
        int[][]arr =new int[][]{{1,2,3},{4,5}};
        //动态初始化1
        String[][] arr2 =new String[3][2];
        //动态初始化2
        String[][] arr3 =new String[3][];

        //2.调用数组元素
        System.out.println(arr[0][1]);
        arr3[0] = new String[4];//arr3先指定列，否则会报错(第0行)
        System.out.println(arr3[0][2]);

        //3.获取数组的长度
        System.out.println(arr3.length);//3行
        System.out.println(arr3[0].length);//4列（第0行）

        //4.如何遍历二维数组
        //使用for循环

        //5.数组元素的默认初始化值
        //规定：二维数组分为外层数组元素，内层数组元素

        //情况1：
        int [][] arr5 =new int[3][2];
        System.out.println(arr5[0]);//地址值([I@5f184fc6)
        System.out.println(arr5[0][0]);// 0

        //float ==> 外层：地址 内层：0.0
        //String ==> 外层：地址 内层：null

        //情况2：
        //int ==> 外层：null 内层：报错
        //float ==> 外层：null 内层：报错
        //String ==> 外层：null 内层：报错
        int [][] arr6 =new int[3][];
        System.out.println(arr6[0]);//null
//        System.out.println(arr6[0][0]);//报错

        String[][] arr7 =new String[3][];//null
        System.out.println(arr7[0]);
//        System.out.println(arr7[0][0]);//报错

    }
}
