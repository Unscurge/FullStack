package ExceptionHandling;

public class finallyf {
    public static void main(String[] args) {
        System.out.println("First Line of code");
        try {
            System.out.println("first line of try");
            int a = 10 / 0;
            System.out.println("Last line of code");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally { // finally block is always executed irrespective of error.
            System.out.println("Finally block is executed");
        }
        System.out.println("Last line of code");
    }
}
