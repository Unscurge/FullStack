package PackageDemo.p1;

public class Launch {
    private String str = "private";
    String str1 = "Default";
    protected String str2 = "Protected";
    public String str3 = "Public";

    void m1() {
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static void main(String[] args) {
        Launch l = new Launch();
        l.m1();
    }
}
