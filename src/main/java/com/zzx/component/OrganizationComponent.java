package com.zzx.component;

public abstract class OrganizationComponent {
    private String name;

    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public <T extends OrganizationComponent> void add(T college) {
        throw new UnsupportedOperationException();
    }

    public <T extends OrganizationComponent> void remove(T college) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
