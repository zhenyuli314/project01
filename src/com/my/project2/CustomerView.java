package com.my.project2;

/*
* 题目：尚硅谷_宋红康_Project2.pptx
* */

public class CustomerView {


    private final CustomerList customerList;

    public CustomerView() {
        customerList = new CustomerList(10);
    }

    public void enterMainMenu() {
        boolean isrunning = true;
        while (isrunning) {
            System.out.println("----------客户信息管理软件----------");
            System.out.println("          1 添 加 客 户");
            System.out.println("          2 修 改 客 户");
            System.out.println("          3 删 除 客 户");
            System.out.println("          4 客 户 列 表");
            System.out.println("          5 退      出");
            System.out.println();
            System.out.print("          请选择（1-5）：_");
            char select = CMUtility.readMenuSelection();
            switch (select) {
                case '1': {
                    this.addNewCustomer();
                    break;
                }
                case '2': {
                    this.modifyCustomer();
                    break;
                }
                case '3': {
                    this.deleteCustomer();
                    break;
                }
                case '4': {
                    this.listAllCustomers();
                    break;
                }
                default: {
                    isrunning = false;
                }
            }
        }

    }

    private void addNewCustomer() {
        Customer customer = new Customer();
        System.out.println("----------添加客户----------");

        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        customer.setName(name);

        System.out.print("性别：");
        char sex = CMUtility.readChar();
        customer.setSex(sex);

        System.out.print("年龄：");
        int age = CMUtility.readInt();
        customer.setAge(age);

        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        customer.setTel(phone);

        System.out.print("邮箱：");
        String em = CMUtility.readString(18);
        customer.setEmail(em);
        customerList.addCustomer(customer);
        System.out.println("----------添加完成-----------");

    }

    private void modifyCustomer() {
        boolean is_running = true;
        while (is_running){
            System.out.println("----------修改客户----------");
            System.out.println("请选择待修改的用户编号（-1退出）：");
            int index = CMUtility.readInt();//选择用户编号
            if (index==-1){
                is_running = false;
            }else if (index>customerList.getTotal()-1){
                System.out.println("您需要修改的用户编号不存在，请重新输入！！");
            }else {
                String old_name = customerList.getCustomer(index).getName();//该用户的旧名字
                System.out.print("姓名(" + old_name + "):");
                String new_name = CMUtility.readString(4, old_name);//从键盘输入新名字
                customerList.getCustomer(index).setName(new_name);//修改对象的姓名

                char old_sex = customerList.getCustomer(index).getSex();
                System.out.print("性别(" + old_sex + "):");
                char new_sex = CMUtility.readChar(old_sex);
                customerList.getCustomer(index).setSex(new_sex);

                int old_age = customerList.getCustomer(index).getAge();
                System.out.print("年龄(" + old_age + "):");
                int new_age = CMUtility.readInt(old_age);
                customerList.getCustomer(index).setAge(new_age);

                String old_tel = customerList.getCustomer(index).getTel();
                System.out.print("电话(" + old_tel + "):");
                String new_tel = CMUtility.readString(11, old_tel);
                customerList.getCustomer(index).setTel(new_tel);

                String old_em = customerList.getCustomer(index).getEmail();
                System.out.print("邮箱(" + old_em + "):");
                String new_em = CMUtility.readString(18, old_em);
                customerList.getCustomer(index).setEmail(new_em);

                System.out.println("----------修改完成----------");
                is_running = false;
            }

        }

    }

    private void deleteCustomer() {
        boolean isrunning = true;
        while (isrunning){
            int tmp = customerList.getTotal();
            System.out.println("----------删除客户----------");
            System.out.println("请选择待删除客户的编号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1){
                isrunning = false;
            }
            else {
                System.out.println("确认是否删除(Y/N):");
                char yes_or_no = CMUtility.readConfirmSelection();
                if (yes_or_no == 'Y') {
                    customerList.deleteCustomer(index);

                }
                int tmp2 = customerList.getTotal();
                if (tmp!=tmp2){
                    System.out.println("----------删除完成----------");
                }
            }
        }
    }

    private void listAllCustomers() {
        System.out.println("----------------客户列表----------------");
        System.out.println("编号\t姓名\t\t性别\t年龄\t\t电话\t\t\t\t\t邮箱");
        int num_customers = customerList.getTotal();
        for (int i =0;i<num_customers;i++){
            String name = customerList.getCustomer(i).getName();
            char sex = customerList.getCustomer(i).getSex();
            int age = customerList.getCustomer(i).getAge();
            String tel = customerList.getCustomer(i).getTel();
            String em = customerList.getCustomer(i).getEmail();
            System.out.println(i+"\t"+name+"\t"+sex+"\t"+age+"\t"+tel+"\t\t\t"+em);
        }
        System.out.println("--------------客户列表完成---------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

}
