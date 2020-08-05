package com.my.package2;

/*
 * 使用二维数组打印一盒10行的杨辉三角
 * 提示：
 * 1.第一行有1个元素，第n行有n个元素
 * 2.每一行的第一个元素和最后一个元素都为1
 * 从第三行开始，对于非第一个元素和最后一个元素的元素满足：
 * yanghui[i][j]=yanghui[i-1][j-1] + yanghui[i-1][j]
 *
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1	
1	5	10	10	5	1
1	6	15	20	15	6	1
1	7	21	35	35	21	7	1
1	8	28	56	70	56	28	8	1
1	9	36	84	126	126	84	36	9	1
 * */
public class demo4 {
    public static void main(String[] args) {
        //第一步：动态初始化
        int[][] yanghui = new int[10][];
        //第二步：给数组赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            if (i>1){
                for (int j=1;j<yanghui[i].length-1;j++){
                    yanghui[i][j]=yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }
        //第三步：遍历数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
