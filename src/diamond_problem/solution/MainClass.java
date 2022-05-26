package diamond_problem.solution;

public class MainClass{

    public static void main(String[] args) {
        Child child = new Child();
        child.walk();
    }
}

//Solution: By Creating Interfaces(GrandParrent, Parent-1 & Parent-2), And Implementing It.
class Child implements Parent1, Parent2{

    @Override
    public void walk() {
        System.out.println("Child Is Walking");
    }
}
