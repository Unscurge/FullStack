package ExceptionHandling;

public class nestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Start of the try");
            String s1 = "Resource";
            try {
                s1.charAt(40);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } finally { // finally is used to close the resource file.
                System.out.println("Finally Block is executed");
                System.out.println("Resourceis closed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
}
