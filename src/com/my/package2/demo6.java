package com.my.package2;

/*
 * 数组的快速排序(快排)
 * */
public class demo6 {
    //交换位置
    private static void exChange(int[] ar, int data_1, int data_2) {
        int tmp;
        tmp = ar[data_1];
        ar[data_1] = ar[data_2];
        ar[data_2] = tmp;
    }


    public static void quickSort(int arr[], int start, int end) {
        if (start>=end){            //错误一：防止进入死循环
            return;
        }

        int start_ = start,end_ = end;
        int base = arr[start_];

        while (start_ < end_) {

            while (arr[end_] >= base && start_ < end_) {//错误二：
                end_--;
            }
            while (arr[start_] < base && start_ < end_) {
                start_++;
            }

            System.out.println("左边"+arr[start_]);
            System.out.println("右边"+arr[end_]);
            System.out.println("---------------------");
            exChange(arr, start_, end_);
            // 6 1 2 5 4 9 3 7 10 8
        }

        exChange(arr, start, start_);

        quickSort(arr, start, start_-1);
        quickSort(arr, start_+1 , end);
    }


    public static void main(String[] args) {
        int arr[] = new int[]{6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
// 6, 1, 2, 5, 4, 3, 9, 7, 10, 8
        quickSort(arr, 0, arr.length - 1);

        for (int value : arr) {
            System.out.print(value + "\t");
        }

    }
}
