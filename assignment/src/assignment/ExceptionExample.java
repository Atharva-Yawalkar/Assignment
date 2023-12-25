package assignment;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Exception is: " + e);
        } finally {
            System.out.println(" Out of Try-catch block ");
        }
    }
}