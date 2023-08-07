package principle.singleresponsibility01;

public class SingleResponsibility3 {
    public static void main(String[] args) {

        VehicleRoad vehicleRoad = new VehicleRoad();
        vehicleRoad.run("汽车");
        VehicleAir vehicleAir = new VehicleAir();
        vehicleAir.run("飞机");
        VehicleWater vehicleWater = new VehicleWater();
        vehicleAir.run("轮船");
    }
}

//交通工具不满足单一职责原则
class VehicleRoad{
    void run (String vehicle){
        System.out.println(vehicle + "在公路上飞驰......");
    }
}

class VehicleAir{
    void run (String vehicle){
        System.out.println(vehicle + "在空中飞驰......");
    }
}
class VehicleWater{
    void run (String vehicle){
        System.out.println(vehicle + "在江面上飞驰......");
    }
}
