package com.zzx.principle.demeter;

import java.util.ArrayList;
import java.util.List;

//
public class Demeter1 {

    public static void main(String[] args) {
        //
        SchoolManager schoolManager = new SchoolManager();
        //  输出总部 和学院的员工
        schoolManager.printAllEmployee(new CollegeManager());

    }

}


//总部员工
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


//学院员工
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


// 学院员工管理类
class CollegeManager {

    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
}

//总部管理类
// 直接朋友类  Employee  CollegeManager
// 非直接朋友类 CollegeEmployee  是一个陌生类  违反了迪米特法则
class SchoolManager {

    //总部员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }


    void printAllEmployee(CollegeManager sub) {

        //��������
        //1. ����� CollegeEmployee ����  SchoolManager��ֱ������
        //2. CollegeEmployee ���Ծֲ�������ʽ������ SchoolManager
        //3. Υ���� �����ط���

        // 打印学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        // 打印总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
