package selva;

public abstract class TransactionThread extends Thread {
    protected Account account;
    protected int amount;

    public TransactionThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
}
