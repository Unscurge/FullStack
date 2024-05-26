package vararg;

public class demo {
    int sum = 0;

    public demo(int... y) {
        for (int j : y) {
            System.out.println(j);
            sum += j;
        }
        System.out.println(sum);
    }

    public void add(int... x) {
        for (int i : x) {
            System.out.println(i);
        }
    }

}
