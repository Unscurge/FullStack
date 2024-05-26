package Instance;

import java.util.ArrayList;
import java.util.Collections;

public class Launch {
    public static void main(String[] args) {
        StuCompare s = new StuCompare();
        ArrayList<Student> sarr = new ArrayList<>();
        sarr.add(new Student(101, "Chaitanya", 21));
        sarr.add(new Student(102, "Arjun", 19));
        sarr.add(new Student(103, "Sanket", 15));

        Collections.sort(sarr, s::compareName);

        for (Student stu : sarr) {
            System.out.println(
                    "Id : " + stu.getRollno() + "\t" + " Name : " + stu.getName() + "\t" + "Age : " + stu.getAge());
        }
    }

}
