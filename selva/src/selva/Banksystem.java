package selva;

public class Banksystem {
    public static void main(String[] args) {
        Account selvaAccount = new Account(1000);

        Thread depositThread1 = new DepositThread(selvaAccount, 500);
        Thread withdrawThread1 = new WithdrawThread(selvaAccount, 300);
        Thread withdrawThread2 = new WithdrawThread(selvaAccount, 800);

        depositThread1.start();
        withdrawThread1.start();
        withdrawThread2.start();

        try {
            depositThread1.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + selvaAccount.getBalance());
    }
}
