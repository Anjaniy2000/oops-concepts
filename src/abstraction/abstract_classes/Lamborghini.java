package abstraction.abstract_classes;

public class Lamborghini extends Car{
    @Override
    public void accelerate() {
        System.out.println("Lamborghini Is Accelerating.");
    }

    @Override
    public void breaking() {
        System.out.println("Lamborghini Is Breaking.");
    }
}
