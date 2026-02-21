package solid

import groovy.transform.CompileStatic

@CompileStatic
class SavingsAccount implements WithdrawableAccount{
    private double currentBalance;
    private double interestRate = 0.04; // 4% interest rate

    public SavingsAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    double getCurrentBalance() {
        return currentBalance
    }

    void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance
    }

    double getInterestRate() {
        return interestRate
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate
    }

    @Override
    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive")
        }
        this.currentBalance += amount
    }

    /**
     * Withdraws a specified amount from the savings account.
     *
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException if the current balance is less than the withdrawal amount
     */
    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive")
        }
        if (this.currentBalance < amount) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal")
        }
        this.currentBalance -= amount
    }
}
