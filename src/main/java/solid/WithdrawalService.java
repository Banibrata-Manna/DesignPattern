package solid;

public class WithdrawalService {
    private final WithdrawableAccount account;

    public WithdrawalService(WithdrawableAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
