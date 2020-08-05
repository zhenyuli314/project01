package com.my.package4;

import org.junit.jupiter.api.Test;

/*
*包装类
*
* */
public class demo6 {
    @Test
    public void  test(){
        int num = 10;
        Integer num2 = num;//自动装箱
        int ini = num2;//自动拆箱

        method(num2);
        method(num);
    }
    public void  method(Object obj){
        System.out.println(obj);
    }
    @Test
    public void test2(){
        Integer num1 = new Integer(10);
        System.out.println(num1);
        Object obj = new Integer(10);
        System.out.println(obj);
    }
}

