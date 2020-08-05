package com.my.package3;

/*
 * 面向对象的特征之一：封装与隐藏
 * 一：问题的引入：
 *   当我们创建一个类的对象以后，我们可以通过“对象.属性”的方法，对对象的属性进行赋值。这里，赋值操作要受到
 * 属性的数据类型和存储范围的制约。但是除此之外，没有其他制约条件。但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件。
 * 这个条件不能在属性声明时体现，我们只能通过方法进行限制条件的添加。
 * 同时，我们需要避免用户再进行使用“对象.属性的方法对属性进行赋值”。则需要将属性声明设为private--->此时针对于属性就体现了封装性。
 *
 * 二：封装性的体现：
 *我们将类的属性XXX私有化（ private）同时，提供公共的（pub1ic）方法来获取(getXxx)和设置(setxxx)此属性值。
 * 拓展：封装性的体现：①如上②不对外暴露的私有的方法③单例模式
 *
 * 三、封装性的体现，需要权限修饰符来配合。
 * 1.Java规定的4种权限（从小到大排列）：private、缺省、protected、pub1ic
 * 2、4种权限可以用来修饰类及类的內部结构：属性、方法、构造器、內部类
    3、具体的，4种权限都可以用来修饰类的內部结构：属性、方法、构造器、內部类修饰类的话，只能使用：缺省、pub1ic
    *
    * 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小。
 * */
public class demo5 {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.name = "大黄";
        ani.age = 1;
//        ani.legs = -4;
        ani.setLegs(4);
        ani.show();

        System.out.println(ani.name+"的腿的的个数为:"+ani.getLegs());

    }
}

class Animal {
    String name;
    int age;
    private int legs;

    public void setLegs(int legs_num){
        if (legs_num>0&&(legs_num%2==0)){
            legs = legs_num;
        }else {
            legs = 0;
            System.out.println("请输入大于0的偶数");
        }
    }

    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println(name+"\t\t"+age+"\t"+legs);
    }
}