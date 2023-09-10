import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard("1234 5678 9012 3456", "05/29", "321", "987654", "001122", 500.00);
    }

    @Test
    public void hasCardNumber() {
        assertEquals("1234 5678 9012 3456", debitCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate() {
        assertEquals("05/29", debitCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber() {
        assertEquals("321", debitCard.getSecurityNumber());
    }

    @Test
    public void hasAccountNumber() {
        assertEquals("987654", debitCard.getAccountNumber());
    }

    @Test
    public void hasSortCode() {
        assertEquals("001122", debitCard.getSortCode());
    }

    @Test
    public void canBeCharged() {
        debitCard.charge(100.00);
        assertEquals(400, debitCard.getBalance(), 0.01);
    }
}
