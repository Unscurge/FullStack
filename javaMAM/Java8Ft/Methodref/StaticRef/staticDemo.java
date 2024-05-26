package StaticRef;
import java.util.ArrayList;
import java.util.Collections;

class PersonInfo {
    private int id;
    private String name;
    private int age;

    public PersonInfo() {
        super();
    }

    public PersonInfo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonInfo [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

class PersonComparator {
    public static int compareAge(PersonInfo a, PersonInfo b) {
        return a.getAge() - b.getAge();
    }
}

public class staticDemo {
    public static void main(String[] args) {
        ArrayList<PersonInfo> arr = new ArrayList<>();
        arr.add(new PersonInfo(101, "ram", 25));
        arr.add(new PersonInfo(102, "Chaitanya", 21));
        arr.add(new PersonInfo(103, "Arjun", 23));

        Collections.sort(arr, PersonComparator::compareAge);// Method Refference
        for (PersonInfo p : arr) {
            System.out.println("Id : " + p.getId() + "\t" + " Name : " + p.getName() + "\t" + "Age : " + p.getAge());
        }
    }

}
