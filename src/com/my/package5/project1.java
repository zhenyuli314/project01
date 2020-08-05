package com.my.package5;

public class project1 {
    public static void main(String[] args) {
        int month = 3;
        Employee[] employee = new Employee[10];
        employee[0] = new SalariedEmployee("李振宇", 001, new MyDate(1997, 3, 14), 15000);
        employee[1] = new SalariedEmployee("郝伟", 002, new MyDate(1996, 4, 15), 12000);
        employee[2] = new HourlyEmployee("郝大伟", 003, new MyDate(1996, 4, 15), 10, 50);
//        System.out.println(employee[0].toString());
        for (int i = 0; i < 3; i++) {
            System.out.println(employee[i].toString());
            if (employee[i].getBirthday().getMonth() == month) {
                System.out.println("生日加新10000元！");
            }
            System.out.println("-------------------------------------");

        }
    }

}

abstract class Employee {

    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract int earnings();

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", number=" + number +
                        ", birthday=" + birthday.toDateString()
                ;
    }
}

class SalariedEmployee extends Employee {
    private int monthlySalary;

    public SalariedEmployee() {

    }

    /**
     * @param name
     * @param number
     * @param birthday
     * @param monthlySalary
     */
    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public int earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}

class HourlyEmployee extends Employee {
    private int wage;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }


    @Override
    public int earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}


class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int i, int i1, int i2) {
        year = i;
        month = i1;
        day = i2;
    }

    public int getMonth() {
        return month;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }

}
