package ForEach;

public class Launch {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        char rrr[] = { 'A', 'B', 'C', 'D', 'E' };
        int sum = 0;
        int add = 0;
        for (int x : arr) {
            System.out.println(x);
            sum += x;
        }
        System.out.println(sum);
        for (char c : rrr) { // type casting
            add += (int) c;
        }
        System.out.println(add);
    }
}
