package Garabage;

public class Launch {
    public static void main(String[] args) {
        garabage s1 = new garabage(1, "Chaitanya");

        s1 = null;
        // System.gc();
        Runtime.getRuntime().gc();
    }

}
