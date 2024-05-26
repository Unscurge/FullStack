public class account {
    static float interestRate;
    static {
        interestRate = 6.5f;
    }

    static void getInterestRate() {
        System.out.println("Interest Rate is : " + interestRate);
    }

}
