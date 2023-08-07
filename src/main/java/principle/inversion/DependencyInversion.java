package principle.inversion;

import jdk.nashorn.internal.ir.CallNode;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

class Email {
    public String getInfo( ) {
         return "电子邮件信息：hello world! ";
    }
}
class SMS{
    public String getInfo( ) {
        return "手机短信信息：hello world! ";
    }
}
class WeChat{
    public String getInfo( ) {
        return "微信信息：hello world! ";
    }
}

class Person{
    public void receive(Email email ){
        System.out.println("我收到了"+email.getInfo());
    }
}
