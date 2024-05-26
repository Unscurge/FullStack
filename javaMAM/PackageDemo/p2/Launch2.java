package PackageDemo.p2;

import PackageDemo.p1.Launch;

public class Launch2 extends Launch {
    public static void main(String[] args) {
        Launch c = new Launch();
        // System.out.println(c.str1); Str1 cannot be used in different package since
        // its Default
        Launch2 obj = new Launch2();
        System.out.println(obj.str2);
        System.out.println(c.str3);
    }
}
