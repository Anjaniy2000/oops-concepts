package abstraction.abstract_classes;

public class Volkswagen extends Car{
    @Override
    public void accelerate() {
        System.out.println("Volkswagen Is Accelerating.");
    }

    @Override
    public void breaking() {
        System.out.println("Volkswagen Is Breaking.");
    }
}
