package Task.Task3;

public class Launch {
    public static void main(String[] args) {
        manager m = new manager();
        m.setIncentive(4500);
        m.setSal(10000);
        m.calculateTotalSalary();
    }

}

class Employee {
    double sal;

    public void setSal(double sal) {
        this.sal = sal;
    }
}

class manager extends Employee {
    double incentive;

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public void calculateTotalSalary() {
        double totalSalary = sal + incentive;
        System.out.println("Total Salary: " + totalSalary);
    }
}