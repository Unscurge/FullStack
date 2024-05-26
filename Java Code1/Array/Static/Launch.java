package Static;

public class Launch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int marks[][] = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 } };

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Marks of Div : " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Marks of Student : " + (j + 1));
                System.out.println(marks[i][j]);
            }

        }
    }

}
