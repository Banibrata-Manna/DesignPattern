package solid;

public interface WithdrawableAccount extends Account {
    public abstract void deposit(double amount);

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException if the account does not have sufficient funds (or overdraft allowed) to cover the withdrawal
     */
    public abstract void withdraw(double amount) throws InsufficientFundsException;
}
