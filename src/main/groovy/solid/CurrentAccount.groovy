package solid

import groovy.transform.CompileStatic

@CompileStatic
class CurrentAccount implements WithdrawableAccount {
    private double currentBalance;
    private double overdraftLimit = 1000.0; // Default overdraft limit

    public CurrentAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    double getCurrentBalance() {
        return currentBalance
    }

    void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance
    }

    double getOverdraftLimit() {
        return overdraftLimit
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit
    }

    @Override
    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive")
        }
        this.currentBalance += amount
    }

    /**
     * Withdraws a specified amount from the account, taking into account the overdraft limit.
     *
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException if the current balance plus overdraft limit is less than the withdrawal amount
     */
    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive")
        }
        if (this.currentBalance + this.overdraftLimit < amount) {
            throw new InsufficientFundsException("Insufficient funds, including overdraft limit")
        }
        this.currentBalance -= amount
    }
}
