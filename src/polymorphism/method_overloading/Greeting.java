package polymorphism.method_overloading;

public class Greeting {

    public void greet(){
        System.out.println("Hey, What's Up?");
    }

    public void greet(String message){
        System.out.println(message);
    }

    public void greet(String message, int frequency){
        for(int i = 0 ; i < frequency ; i++){
            System.out.println(message);
        }
    }
}
