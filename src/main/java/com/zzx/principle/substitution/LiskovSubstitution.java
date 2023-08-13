package com.zzx.principle.substitution;

public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 8 =" + a.fun1(11, 8));
        System.out.println("1 - 8 =" + a.fun1(11, 8));

        B b = new B();
        System.out.println("11 - 8 =" + b.fun1(11, 8));
        System.out.println("1 - 8 =" + b.fun1(11, 8));
        System.out.println("11 + 3 + 9 =" + b.sumAddNine(11, 3));
    }
}

class A {
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int sumAddNine(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }
}

