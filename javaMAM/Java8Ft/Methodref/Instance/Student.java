package Instance;

public class Student {
    private int Rollno;
    private String Name;
    private int Age;
    public Student() {
        super();
    }
    public Student(int rollno, String name, int age) {
        Rollno = rollno;
        Name = name;
        Age = age;
    }
    public int getRollno() {
        return Rollno;
    }
    public void setRollno(int rollno) {
        Rollno = rollno;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    @Override
    public String toString() {
        return "Student [Rollno=" + Rollno + ", Name=" + Name + ", Age=" + Age + "]";
    }
}
