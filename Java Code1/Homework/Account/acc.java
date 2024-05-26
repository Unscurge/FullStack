package Homework.Account;

public class acc {
    int accNo;
    String ownerName;
    double balance;

    public void getAccno(int accno) {
        accNo = accno;
    }

    public void getOwnername(String sname) {
        ownerName = sname;
    }

    public void getBalance(double bal) {
        balance = bal;
    }

    public int setAccno() {
        return accNo;
    }

    public String setOwner() {
        return ownerName;
    }

    public double setbal() {
        return balance;
    }

}
