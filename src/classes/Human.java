package classes;

public class Human {

    //Data-Members(States):
    public String name;
    public int age;

    public void introduction(){
        System.out.println("Hi, I'm " + name + ", " + age + " Years Old Engineer.");
    }

    //Methods(Behaviors):
    public void walk(){
        System.out.println("I'm Walking");
    }

    public void speak(){
        System.out.println("I'm Speaking");
    }

    public void eat(){
        System.out.println("I'm Eating");
    }

    public void sleep(){
        System.out.println("I'm Sleeping");
    }
}
