package solid

import groovy.transform.CompileStatic

@CompileStatic
class FixedTermDepositAccount implements Account{
    private double currentBalance;
    private double interestRate = 0.06; // 6% interest rate

    public FixedTermDepositAccount(double currentBalance) {
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
}
