package com.zzx.component;

import java.util.List;

public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void print() {
        System.out.println(this.getName() + this.getDesc());
    }
}
