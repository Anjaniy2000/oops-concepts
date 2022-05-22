package polymorphism.method_overridding;

public class Dog extends Pet{

    @Override
    public void walk(){
        System.out.println("Dog Is Walking.");
    }
}
