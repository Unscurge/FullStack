package Methods;

public class methodfunc {
    // Non Parameterised Without Return time
    public void dowork() {
        System.out.println("Doing work");
    }

    // Non Parameterised with return type
    public int add() {
        int a = 55, b = 10;
        int add;
        add = a + b;
        return add;
    }

    // Non Parameterised with return type (If Else condition)
    public int findmax() {
        int n1 = 10;
        int n2 = 20;
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    // Parameterised Without retuen type
    public void addition(int x, int y)// formal Parameter
    {
        int result = x + y;
        System.out.println("Addition is " + result);
    }

    // Parametrised with return type
    public int sub(int x, int y) {
        int result = x - y;
        return result;
    }
}
