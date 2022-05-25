package dimond_problem.solution;

public class MainClass{

    public static void main(String[] args) {
        Child child = new Child();
        child.walk();
    }
}

class Child implements Parent1, Parent2{

    @Override
    public void walk() {
        System.out.println("Child Is Walking");
    }
}
