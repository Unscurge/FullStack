package settersgetters.Employee;

public class employee {
    int empID;
    String empName;
    int empSal;
    int empExp;

    public void setID(int id) {
        empID = id;
    }

    public void setName(String ename) {
        empName = ename;
    }

    public void setSal(int sal) {
        empSal = sal;
    }

    public void setexp(int exp) {
        empExp = exp;
    }

    public int getID() {
        return empID;
    }

    public String getName() {
        return empName;
    }

    public int getSal() {
        return empSal;
    }

    public int getexp() {
        return empExp;
    }

}
