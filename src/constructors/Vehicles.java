package constructors;

public class Vehicles {
    public static void main(String[] args) {

        VehicleModel car = new VehicleModel(4);
        System.out.println(car.wheels);
        System.out.println(car.headLights);

        VehicleModel bike = new VehicleModel();
        System.out.println(bike.wheels);
        System.out.println(bike.headLights);

        VehicleModel scooty = new VehicleModel(2, "Yellow");
        System.out.println(scooty.wheels);
        System.out.println(scooty.headLights);
        System.out.println(scooty.color);
    }
}
