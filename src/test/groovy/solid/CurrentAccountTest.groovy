package solid

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class CurrentAccountTest {

    @Test
    void 'test successful deposit'() {
        def account = new CurrentAccount(100.0)
        account.deposit(50.0)
        assertEquals(150.0, account.currentBalance)
    }

    @Test
    void 'test negative deposit throws exception'() {
        def account = new CurrentAccount(100.0)
        def exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0)
        })
        assertEquals("Deposit amount must be positive", exception.message)
    }

    @Test
    void 'test successful withdrawal within balance'() {
        def account = new CurrentAccount(100.0)
        account.withdraw(50.0)
        assertEquals(50.0, account.currentBalance)
    }

    @Test
    void 'test successful withdrawal using overdraft'() {
        def account = new CurrentAccount(100.0)
        account.overdraftLimit = 500.0
        // Withdrawing more than balance but within overdraft limit
        account.withdraw(400.0)
        assertEquals(-300.0, account.currentBalance)
    }

    @Test
    void 'test withdrawal exceeding overdraft limit throws exception'() {
        def account = new CurrentAccount(100.0)
        account.overdraftLimit = 500.0
        // Max possible withdrawal is 100 + 500 = 600
        def exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(600.01)
        })
        assertEquals("Insufficient funds, including overdraft limit", exception.message)
    }

    @Test
    void 'test negative withdrawal throws exception'() {
        def account = new CurrentAccount(100.0)
        def exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0)
        })
        assertEquals("Withdrawal amount must be positive", exception.message)
    }
}
