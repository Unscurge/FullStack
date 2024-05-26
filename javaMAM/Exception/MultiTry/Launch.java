package Exception.MultiTry;

public class Launch {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (ArithmeticException a) {
            System.out.println(a);
        } catch (NumberFormatException n) {
            System.out.println(n);
        } catch (ArrayIndexOutOfBoundsException a1) {
            System.out.println(a1);
        } catch (StringIndexOutOfBoundsException d) {
            System.out.println(d);
        } catch (NullPointerException n1) {
            System.out.println(n1);
        }
    }
}
