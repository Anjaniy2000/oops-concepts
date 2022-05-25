package exception_handling.custom_exceptions;

public class MainClass {
    public static void main(String[] args) {
        validateAge(20);
        validateAge(12);
    }

    public static void validateAge(int age){
        if(age < 18){
            throw new MyCustomArithmeticException("Age Is Not Eligible For Voting.");
        }
        else {
            System.out.println("Age Is Eligible For Voting.");
        }
    }
}
