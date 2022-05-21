package inheritance;

public class MainClass {

    public static void main(String[] args) {

        Teacher anuj = new Teacher();
        anuj.name = "Anuj Kumar Sharma";
        anuj.walk();
        anuj.eat();
        anuj.teach();

        System.out.println("------------------------------------------------------------");

        Student jay = new Student();
        jay.name = "Jay Shah";
        jay.walk();
        jay.eat();
        jay.study();

        System.out.println("------------------------------------------------------------");

        Singer drake = new Singer();
        drake.name = "Drake";
        drake.walk();
        drake.eat();
        drake.sing();
    }
}
