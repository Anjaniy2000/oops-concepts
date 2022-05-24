package exception_handling;

public class Throws {
    public static void main(String[] args) {
        firstFunction();
    }

    public static void firstFunction(){
        System.out.println("Inside First Function");
        try {
            secondFunction();
        }catch (Exception e){
            System.out.println(e.getMessage() + " Occurred");
        }

    }

    public static void secondFunction() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger Is Coming.");
        }
    }
}
