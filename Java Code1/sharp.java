public class sharp {
    public static void main(String[] args) {
        savingAccount s1 = new savingAccount();
        s1.setAccNo(101);
        s1.setName("Chaitanya");
    }
}

class account {
    int accNo;
    String name;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getInterestRate() {
    }

}

class savingAccount extends account {

}

class FixedDepositAccount extends account {

}