package EmpShort;

public class Employee {
    int empId;
    String Name;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String toString() {
        return "Id : " + empId + " Name : " + Name + "\n";
    }
}
