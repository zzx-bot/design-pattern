package com.zzx.visitor;

public class Client {
    public static void main(String[] args) {
        Man lisi = new Man("lisi");
        Woman zhangyuan = new Woman("zhangyuan");

        lisi.accept(new Like());
        zhangyuan.accept(new Dislike());

        lisi.print();
        zhangyuan.print();


        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addPerson(lisi);
        objectStructure.addPerson(zhangyuan);

        objectStructure.attach(new Like());

    }
}
