package com.zzx.principle.inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
        person.receive(new SMS());
    }

}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：hello world! ";
    }
}

class SMS implements IReceiver {
    public String getInfo() {
        return "手机短信信息：hello world! ";
    }
}

class WeChat implements IReceiver {
    public String getInfo() {
        return "微信信息：hello world! ";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println("我收到了" + receiver.getInfo());
    }
}
