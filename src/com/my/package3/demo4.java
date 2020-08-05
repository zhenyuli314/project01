package com.my.package3;
/*
* 递归方法的使用（了解）
1.递归方法：一个方法体内调用它自身。
2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
* */
public class demo4 {
    public static void main(String[] args) {
        demo4 t = new demo4();
        System.out.println(t.test1(3));
        System.out.println(t.test2(10));

    }
    /**
     * 递归求阶乘(n!)
     */
    public int test1(int n){
        if (n==1){
            return 1;
        }else {
            return n*test1(n-1);
        }
    }

    /**
     * 已知有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值
     */
    public int test2(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2*test2(n-1)+test2(n-2);
        }
    }
}
