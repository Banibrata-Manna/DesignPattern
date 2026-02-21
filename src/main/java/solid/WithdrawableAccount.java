package solid;

public interface WithdrawableAccount extends Account {
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
