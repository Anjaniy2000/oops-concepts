package typecasting;

public class DownCastingDemo {
    public static void main(String[] args) {
        Parent parent = new Child();

        Child child = (Child)parent; //DownCasting:
        child.greet();
        child.show();
    }
}
