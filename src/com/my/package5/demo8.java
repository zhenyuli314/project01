package com.my.package5;

/*
 * 抽象类的应用；模板方法的设计模式
 * */
public class demo8 {

    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();

    }
}

abstract class Template {

    public void spendTime() {
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("花费时间为：" + diff);
    }

    public abstract void code();
}

class SubTemplate extends Template {

    @Override
    public void code() {
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
