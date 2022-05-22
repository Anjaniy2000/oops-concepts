package abstraction.abstract_classes;

public class Audi extends Car{

    @Override
    public void accelerate() {
        System.out.println("Audio Is Accelerating.");
    }

    @Override
    public void breaking() {
        System.out.println("Audi Is Breaking.");
    }
}
