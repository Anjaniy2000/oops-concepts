package polymorphism.method_overridding;

public class MainClass {
    public static void main(String[] args) {
        Dog toby = new Dog();
        toby.walk();

        Pet pet = toby; //Object-Upcasting
        pet.walk();
    }
}
