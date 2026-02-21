package solid;

public class DepositService {
    private final Account account;

    public DepositService(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }
}
