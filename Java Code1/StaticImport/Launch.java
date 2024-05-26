package StaticImport;

import static StaticImport.staticImp.pi;
import static StaticImport.staticImp.addition;

public class Launch {

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(addition(10, 20));
    }

}
