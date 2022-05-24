package packages;

import packages.mymathpackage.Greetings;
import packages.mymathpackage.Maths;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("PI = " + Maths.PI);

        int a = 10, b = 20;
        System.out.println("Minimum = " + Maths.getMin(a, b));
        System.out.println("Maximum = " + Maths.getMax(a, b));

        Greetings greetings = new Greetings();
        greetings.greet("Good Evening");
    }
}
