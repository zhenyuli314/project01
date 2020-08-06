package com.my.package5;
/*
* 题目：练习1
* */
public class demo11 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(10);
        System.out.println(c1.compareTo(c2));

        ComparableRectangle r1 = new ComparableRectangle(30,10);
        ComparableRectangle r2 = new ComparableRectangle(20,10);
        int r = r1.compareTo(r2);
        System.out.println(r);

    }

}
interface CompareObject{
    //若返回值0，代表相等；正数，当前对象大，反之小
    int compareTo(Object o);
}
class Circle{
    private int redius;

    public Circle() {
    }

    public Circle(int redius) {
        this.redius = redius;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }
}
class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {
    }

    public ComparableCircle(int redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        if (this==o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            if (this.getRedius()>c.getRedius()){
                return 1;
            }else if (this.getRedius() == c.getRedius()){
                return 0;
            }else {
                return -1;
            }
        }else {
            return 0;
        }
    }
}

class Rectangle{
    private double wight;

    private double hight;

    public Rectangle() {
    }

    public Rectangle(double wight, double hight) {
        this.wight = wight;
        this.hight = hight;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double findarea(){
        return wight*hight;
    }
}

class ComparableRectangle extends Rectangle implements Comparable{
    public ComparableRectangle() {
    }

    public ComparableRectangle(double wight, double hight) {
        super(wight, hight);
    }


    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableRectangle){
            ComparableRectangle c = (ComparableRectangle) o;
            if (c.findarea() == this.findarea()){
                return 0;
            }else if (this.findarea()>c.findarea()){
                return 1;
            }else {
                return -1;
            }
        }else {
            return 0;
        }
    }
}