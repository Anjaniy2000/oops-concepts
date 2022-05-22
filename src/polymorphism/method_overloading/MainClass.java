package polymorphism.method_overloading;

public class MainClass {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.greet("Good Morning");
        greeting.greet("Good Evening", 5);
    }
}
