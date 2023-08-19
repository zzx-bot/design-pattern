package com.zzx.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    public List<Department> departmentList;

    @Override
    public String getName() {
        return "信息学院";
    }

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
