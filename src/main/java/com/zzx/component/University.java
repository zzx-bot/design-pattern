package com.zzx.component;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {

    private List<College> collegeList = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }


    public void add(College college) {
        this.collegeList.add(college);
    }


    public void remove(College college) {
        this.collegeList.remove(college);
    }

    @Override
    public void print() {

        System.out.println(this.getName() + "学校，" + this.getDesc() +
                "共有" + this.collegeList.size() + "个学院：");
        System.out.println("***************************************");
        this.collegeList
                .forEach(College::print);
    }
}
