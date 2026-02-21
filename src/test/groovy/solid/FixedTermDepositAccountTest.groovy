package solid

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class FixedTermDepositAccountTest {

    @Test
    void 'test successful deposit'() {
        def account = new FixedTermDepositAccount(500.0)
        account.deposit(200.0)
        assertEquals(700.0, account.currentBalance)
    }

    @Test
    void 'test negative deposit throws exception'() {
        def account = new FixedTermDepositAccount(500.0)
        def exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100.0)
        })
        assertEquals("Deposit amount must be positive", exception.message)
    }

    @Test
    void 'test default interest rate is correct'() {
        def account = new FixedTermDepositAccount(500.0)
        assertEquals(0.06, account.interestRate)
    }
}
