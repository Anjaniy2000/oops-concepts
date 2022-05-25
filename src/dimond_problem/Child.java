package dimond_problem;

//This Will Give Compile Time Error(Can't Inherit More Than One Class).
public class Child extends Parent1, Parent2{
    public void walk(){
        System.out.println("Walking");
    }

    public static void main(String[] args) {

    }
}
