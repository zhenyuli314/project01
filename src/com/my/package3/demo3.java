package com.my.package3;
/*
*（1）定义一个Circle类，包含一个 double型的 radius属性代表圆的半径，一个findArea()方法返回圆的面积。
*（2）定义一个类 Passobject，在类中定义一个方法 printAreas()，
* 该方法的定义如下：public void printAreas(Circle c, int time)
* 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
* 例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积
* (3)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
* */
public class demo3 {
    public static void main(String[] args) {
        Passobject p =new Passobject();
        System.out.println("Radius\t\tArea");
        Circle c = new Circle();
        p.printAreas(c,6);
        System.out.println("now radius is:"+ c.radius);
    }
}

class Circle{
    double radius;
    public double findArea(){
        return Math.PI*Math.pow(radius,2);
    }
}

class Passobject{
    public void printAreas(Circle c,int time){
        for (int i =1;i<time;i++){
            c.radius = i;
            double area = c.findArea();
            System.out.println(c.radius + "\t\t" + area);
        }
        c.radius = time;

    }
}