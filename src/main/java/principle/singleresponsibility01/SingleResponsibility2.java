package principle.singleresponsibility01;

public class SingleResponsibility2 {
    public static void main(String[] args) {

        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

//交通工具不满足单一职责原则
class Vehicle2{
    void runRoad(String vehicle){
        System.out.println(vehicle + "在公路上飞驰......");
    }
    void runAir(String vehicle){
        System.out.println(vehicle + "在天上飞......");
    }
    void runWater(String vehicle){
        System.out.println(vehicle + "在水上飞驰......");
    }
}
