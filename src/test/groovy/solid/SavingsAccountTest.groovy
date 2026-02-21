package solid

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class SavingsAccountTest {

    @Test
    void 'test successful deposit'() {
        def account = new SavingsAccount(200.0)
        account.deposit(100.0)
        assertEquals(300.0, account.currentBalance)
    }

    @Test
    void 'test negative deposit throws exception'() {
        def account = new SavingsAccount(200.0)
        def exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0)
        })
        assertEquals("Deposit amount must be positive", exception.message)
    }

    @Test
    void 'test successful withdrawal within balance'() {
        def account = new SavingsAccount(200.0)
        account.withdraw(50.0)
        assertEquals(150.0, account.currentBalance)
    }

    @Test
    void 'test withdrawal exceeding balance throws exception'() {
        def account = new SavingsAccount(200.0)
        def exception = assertThrows(InsufficientFundsException.class, () -> {
            account.withdraw(200.01)
        })
        assertEquals("Insufficient funds for withdrawal", exception.message)
    }

    @Test
    void 'test negative withdrawal throws exception'() {
        def account = new SavingsAccount(200.0)
        def exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0)
        })
        assertEquals("Withdrawal amount must be positive", exception.message)
    }
    
    @Test
    void 'test default interest rate is correct'() {
        def account = new SavingsAccount(200.0)
        assertEquals(0.04, account.interestRate)
    }
}
