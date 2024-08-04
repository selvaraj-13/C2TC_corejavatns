package selva;

public class DepositThread extends TransactionThread {
    public DepositThread(Account account, int amount) {
        super(account, amount);
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
