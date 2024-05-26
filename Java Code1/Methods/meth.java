package Methods;

public class meth {
    public static void main(String[] args) {
        methodfunc func = new methodfunc();
        System.out.println(func.findmax());
        int num1 = 10;
        int num2 = 20;
        func.addition(num1, num2);// arguments
        System.out.println("Subtraction is " + func.sub(25, 10));
    }

}
