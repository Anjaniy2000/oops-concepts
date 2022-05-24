package exception_handling;

public class Throw {
    public static void main(String[] args){
//        validateAge(20);
        validateAge(12);
    }

    public static void validateAge(int age){
        if(age < 18){
            //Throw Specific Custom Exception:
            throw new ArithmeticException("Not Valid Age For Voting.");
        }
        else{
            System.out.println("Eligible For Voting.");
        }
    }
}
