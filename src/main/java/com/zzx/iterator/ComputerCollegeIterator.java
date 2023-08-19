package com.zzx.iterator;

import java.util.Iterator;
import java.util.List;

public class ComputerCollegeIterator implements Iterator {

    //这里我们需要 Department 是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; //遍历的位

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Department next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
