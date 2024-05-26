package PackageDemo.p1;

public class Second {
    public static void main(String[] args) {
        Launch l1 = new Launch();
        // l1.m1();
        // System.out.println(l1.str); - error because str is private
        System.out.println(l1.str1); // not showing error because str1 is default7
        System.out.println(l1.str2);
        System.out.println(l1.str3);

    }
}
