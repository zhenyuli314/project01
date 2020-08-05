package com.my.project2;

public class Customer {
    private String name;
    private char sex;
    private int age;
    private String tel;
    private String email;

    public Customer() {

    }
    public Customer(String name, char sex, int age, String tel, String email) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Customer person1 = new Customer();
        person1.setName("李民");
        person1.setAge(19);
        person1.setSex('男');
        person1.setTel("18821617998");
        person1.setEmail("2450199970@qq.com");
        System.out.println("姓名："+person1.getName());
        System.out.println("性别："+person1.getSex());
        System.out.println("年龄："+person1.getAge());
        System.out.println("电话："+person1.getTel());
        System.out.println("邮箱："+person1.getEmail());
    }

}
