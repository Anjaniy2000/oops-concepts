package keywords;

public class Final extends A{

    public static void main(String[] args) {

        //Final-Variable:
        final String name = "Jay";
//        name = "Anjaniy";

        //Trying To Override Final Method(Greet):
//        public static void greet(){
//            System.out.println("Good Evening.");
//        }
    }
}

class A{

    //Final-Method:
    public final void greet(){
        System.out.println("Good Morning.");
    }
}

//Final-Class:
final class B{

}

//Trying To Extend The Final-Class(B):
//class C extends B{
//
//}
