package Bank;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test program for the Bank class.
 */
public class BankUnitTester {

    private static final double EPSILON = 10e-14;

    private static Bank firstBankOfJava;

    @BeforeClass
    public static void init() {
        firstBankOfJava = new Bank();
    }

    @Before
    public void setUp() {
        firstBankOfJava.addAccount(new BankAccount(1001, 20000));
        firstBankOfJava.addAccount(new BankAccount(1015, 10000));
        firstBankOfJava.addAccount(new BankAccount(1729, 15000));
    }

    @Test
    public void testCountBalanceAtLeast() {
        double threshold = 15000;
        int count = firstBankOfJava.countBalancesAtLeast(threshold);
        assertEquals(2, count);
    }

    @Test
    public void testFind() {
        BankAccount account = firstBankOfJava.find(1015);
        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(10000, account.getBalance(), EPSILON);
    }

    @Test
    public void testGetMaximum() {
        BankAccount max = firstBankOfJava.getMaximum();
        assertEquals(1729, max.getAccountNumber()); // Wrong expected result!
    }
}
