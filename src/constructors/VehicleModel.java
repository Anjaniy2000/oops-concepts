package constructors;

public class VehicleModel {

    public int wheels;
    public int headLights;
    public String color;

    //Empty-Constructor(Customizing Java's Default-Constructor):
    public VehicleModel(){
        this.wheels = 2;
        this.headLights = 2;
        this.color = "White";
    }

    //Parametrized-Constructor:
    public VehicleModel(int wheels){
        this.wheels = wheels;
        this.headLights = 2;
        this.color = "White";
    }

    //Constructor-Overloading:
    public VehicleModel(int wheels, String color){
        this.wheels = wheels;
        this.headLights = 2;
        this.color = color;
    }

}
