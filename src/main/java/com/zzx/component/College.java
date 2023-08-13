package com.zzx.component;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    private List<Department> departmentList = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }


    public void add(Department dep) {
        departmentList.add(dep);
    }


    public void remove(Department dep) {
        departmentList.add(dep);
    }

    @Override
    public void print() {

        System.out.println(this.getName() + "院系，" + this.getDesc() +
                "共有" + this.departmentList.size() + "个专业：");
        System.out.println("_______________________________________");
        this.departmentList
                .forEach(Department::print);
    }
}
