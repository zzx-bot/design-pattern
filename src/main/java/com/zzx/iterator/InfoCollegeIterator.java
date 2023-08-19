package com.zzx.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    List<Department> departmentList; // 信息工程学院是以 List 方式存放系
    int index = -1;//索

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }

    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }

    // 空实现 remove
    @Override
    public void remove() {

    }

}
