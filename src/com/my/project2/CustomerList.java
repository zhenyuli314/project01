package com.my.project2;

public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index > total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (total == 0){
            System.out.println("当前客户数量为0!");
        }else {
            if ((index < -1 || index >= total) ) {
                System.out.println("您所删除的客户不存在！！！");
                return false;
            }
            customers[index] = null;
            total--;
            for (int i = index; i < total; i++) {
                customers[i] = customers[i + 1];
            }
        }
        return true;
    }

    public Customer[] getAllCustomers() {
//        return customers;
        Customer[] custs = new Customer[total];
        for (int i=0;i<total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {

        if (index < 0 || index > total) {
            System.out.println("请重新输入");
        }
        return customers[index];
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        CustomerList customerList = new CustomerList(10);
        customerList.addCustomer(new Customer("黎明1",'男',10,"18821617998","2450199970@qq.com"));
//        customerList.addCustomer(new Customer("小红2",'女',18,"18821617998","2450199970@qq.com"));
//        customerList.addCustomer(new Customer("小红3",'女',18,"18821617998","2450199970@qq.com"));
//        customerList.addCustomer(new Customer("小红4",'女',18,"18821617998","2450199970@qq.com"));
//        customerList.addCustomer(new Customer("小红5",'女',18,"18821617998","2450199970@qq.com"));
//        customerList.replaceCustomer(0,new Customer("黎明",'女',19,"18821617998","2450199970@qq.com"));
        customerList.deleteCustomer(-1);
//        System.out.println(customerList.getAllCustomers()[0].getName());
//        System.out.println(customerList.getCustomer(0).getName());
        System.out.println(customerList.getTotal());

    }
}
