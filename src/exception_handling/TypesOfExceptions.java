package exception_handling;

public class TypesOfExceptions {
    public static void main(String[] args) {
        //Checked-Exception(Syntax Errors)(Detected During Compiler Time):
        int[] array = new int[10]();

        //Unchecked-Exception(Logical Errors)(Detected During Run Time):
        System.out.println(5 / 0);
    }
}