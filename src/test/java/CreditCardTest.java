import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard("1234 5678 9012 3456", "05/29", "321", 100.01);
    }

    @Test
    public void hasCardNumber() {
        assertEquals("1234 5678 9012 3456", creditCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate() {
        assertEquals("05/29", creditCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber() {
        assertEquals("321", creditCard.getSecurityNumber());
    }

    @Test
    public void hasAvailableCredit() { assertEquals(100.01, creditCard.getAvailableCredit(), 0.001);}
}
