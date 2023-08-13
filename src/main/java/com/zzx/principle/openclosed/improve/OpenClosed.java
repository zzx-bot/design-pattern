package com.zzx.principle.openclosed.improve;


public class OpenClosed {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
//        if (s.m_type == 1)
//            drawRectangle(s);
//        else if (s.m_type == 2)
//            drawCircle(s);
        s.draw();
    }

//    public void drawRectangle(Shape r) {
//        System.out.println("矩形");
//    }
//
//    public void drawCircle(Shape r) {
//        System.out.println("圆形");
//    }
}

// 使用抽象类 声明抽象方法:每个类自己实现画图方法
// 开闭原则  对使用方（类 上层）封闭  对提供方（类 下层层）开放  尽量减少代码修改
abstract class Shape {
    int m_type;

    abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("圆形");
    }
}

