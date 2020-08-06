package com.my.package5;

/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程！
 * */
public class demo10 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Printer printer = new Printer();
        computer.transData(printer);
        //2.创建了接口的非匿名实现类的匿名对象
        computer.transData(new Printer());
        //3.创建了接口的匿名实现类的非匿名对象
        USB usb = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作！");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作！");
            }
        };
        computer.transData(usb);
        //4.创建了匿名对象的匿名实现类
        computer.transData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });


        System.out.println("-----------------------");
        computer.transData(new Flash());
    }
}

interface USB {
    void start();

    void stop();
}

class Computer {
    public void transData(USB usb) {
        usb.start();
        System.out.println("转换工作。。。");
        usb.stop();
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作。");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作。");
    }
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("闪存开始！");
    }

    @Override
    public void stop() {
        System.out.println("闪存结束！");
    }
}
