package com.zzx.component;

public class Client {
    public static void main(String[] args) {
        //
        University university = new University("清华大学", "全国第一");

        College college = new College("计算机学院", "目前就业还OK");
        College college2 = new College("土木建筑学院", "都牛马");


        Department department = new Department("软件工程", "码农");
        Department department1 = new Department("网络安全", "黑客/白客");


        Department department2 = new Department("道路桥梁工程", "造桥的");
        Department department3 = new Department("造价工程", "高造价工程");

        university.add(college);
        university.add(college2);

        college.add(department);
        college.add(department1);

        college2.add(department2);
        college2.add(department3);

        university.print();

    }
}
