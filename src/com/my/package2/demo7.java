package com.my.package2;
/*
 * 数组的快速排序(快排)
 * */
public class demo7 {

    private static void swap(int[] ar, int data_1, int data_2) {
        int tmp;
        tmp = ar[data_1];
        ar[data_1] = ar[data_2];
        ar[data_2] = tmp;
    }

    public static void quickSort(int[] arrs, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int tmp = arrs[i];
        while (i < j) {
            while (arrs[j] >= tmp && i < j)
                j--;
            while (arrs[i] <= tmp && i < j)
                i++;
            swap(arrs, i, j);
        }
        swap(arrs, i, start);

        int mid = i;
        quickSort(arrs, start, mid - 1);
        quickSort(arrs, mid + 1, end);

    }
    public static void main(String[] args) {
        int [] arr = new int[]{ 6, 1, 2, 5, 4, 3, 9, 7, 10, 8};

        // 6, 1, 2, 5, 4, 3, 9, 7, 10, 8
        quickSort(arr, 0, arr.length - 1);

        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }

}
