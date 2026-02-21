package solid;

public class WithdrawalService {
    private final WithdrawableAccount account;

    public WithdrawalService(WithdrawableAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
