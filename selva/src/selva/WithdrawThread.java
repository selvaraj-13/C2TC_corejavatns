package selva;

public class WithdrawThread extends TransactionThread {
    public WithdrawThread(Account account, int amount) {
        super(account, amount);
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
