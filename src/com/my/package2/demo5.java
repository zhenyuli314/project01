package com.my.package2;
/*
* 数组的冒泡排序
* */
public class demo5 {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3};

        //冒泡排序
        for (int i =0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        //遍历
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
