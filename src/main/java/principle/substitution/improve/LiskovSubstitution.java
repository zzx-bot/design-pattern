package principle.substitution.improve;

public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 8 =" + a.fun1(11, 8));
        System.out.println("1 - 8 =" + a.fun1(11, 8));

        B b = new B();
        System.out.println("11 + 8 =" + b.fun1(11, 8));
        System.out.println("1 + 8 =" + b.fun1(11, 8));
        System.out.println("11 + 3 + 9 =" + b.fun2(11, 3));

        System.out.println("11 - 3 =" + b.fun3(11, 3));
    }
}

//更加基础的类
class Base {

}

//A类
class A extends Base {
    //返回两个数的差
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}

//B类
class B extends Base {
    private A a = new A();

    //返回两个数的和
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }

    public int fun3(int num1, int num2) {
        return a.fun1(num1, num2);
    }
}

