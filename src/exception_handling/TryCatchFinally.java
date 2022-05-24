package exception_handling;

public class TryCatchFinally {
    public static void main(String[] args) {

        int[] array = new int[5];

        //ArrayIndexOutOfBoundsException:
        try{
            System.out.println(array[10]);
        }catch(Exception e)//Can Be Exception Object Or Any Specific Exception:
        {
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block Will Be Always Executed After Try-Catch Block, No Matter What!");
        }

        //Divide By Zero:
        try {
            System.out.println(5 / 0);
        }catch(ArithmeticException e)//Can Be Exception Object Or Any Specific Exception:
        {
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block Will Be Always Executed After Try-Catch Block, No Matter What!");
        }
    }
}
