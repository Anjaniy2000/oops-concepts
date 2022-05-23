package keywords;

public class Static {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("PI = " + MyMath.PI);
        System.out.println("Maximum Between " + a + " And " + b + " Is " + MyMath.getMax(a, b));
        System.out.println("Minimum Between " + a + " And " + b + " Is " + MyMath.getMin(a, b));

        MyMath.Greet.greet("Good Morning");
    }

    //Static-Blocks:
    static {
        System.out.println("Inside First Static Block.");
    }

    static {
        System.out.println("Inside Second Static Block.");
    }
}

class MyMath{

    //Static-Variables:
    public static double PI = 3.141592653589793;

    //Static-Methods:
    public static int getMax(int a, int b){
        if(a > b) return a;
        else return b;
    }

    public static int getMin(int a, int b){
        if(a < b) return a;
        else return b;
    }

    //Static-Inner(Nested) Class:
    static class Greet{
        public static void greet(String message){
            System.out.println("Hi There, " + message);
        }
    }

}
