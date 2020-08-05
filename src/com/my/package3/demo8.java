package com.my.package3;

/*
 * this关键字的使用
 * Boy 与 Girl的例子
 * */
public class demo8 {
    public static void main(String[] args) {
        Boy boy = new Boy(23, "罗密欧");
        Girl girl1 = new Girl(18,"朱丽叶");
        Girl girl2 = new Girl(19,"祝英台");
        boy.shout();
        boy.marry(girl1);
        girl1.marry(boy);
        girl1.compare(girl2);

    }
}

class Boy {
    private int age;
    private String name;

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        if (age > 22) {
            System.out.println("可以结婚了！");
        } else {
            System.out.println("你年纪还小");
        }
    }

    public void marry(Girl girl) {
        System.out.println(name+"喜欢" + girl.getName());
    }
}

class Girl {
    private int age;
    private String name;

    public Girl(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy) {
        System.out.println("我要嫁给：" + boy.getName());
        boy.marry(this);
    }

    public void compare(Girl girl) {
        if (this.age > girl.age) {
            System.out.println(this.name + "的年纪更大！");
        } else if (this.age < girl.age) {
            System.out.println(girl.name + "的年纪更大！");
        } else {
            System.out.println("两个女孩一样大！");
        }
    }
}