package typecasting;

public class UpcastingDemo {

    public static void main(String[] args) {
        Parent parent = new Child();//UpCasting:
        parent.show();
    }

}

class Parent{
    public void show(){
        System.out.println("Inside Parent Class.");
    }
}

class Child extends Parent{
    public void greet(){
        System.out.println("Good Morning.");
    }
}