package exception_handling.custom_exceptions;

public class MyCustomArithmeticException extends RuntimeException{
    public MyCustomArithmeticException(String exceptionMessage){
        super(exceptionMessage);
    }
}
