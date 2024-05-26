package HomeworkInterface;

public class BankLaunch {
    public static void main(String[] args) {

    }
}

class Bank {

}

class SavingsAccount implements Account {

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void viewBalane() {

    }

}

class CurrentAccount implements Account {

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void viewBalane() {

    }

}

interface Account {
    void deposit();

    void withdraw();

    void calculateInterest();

    void viewBalane();
}