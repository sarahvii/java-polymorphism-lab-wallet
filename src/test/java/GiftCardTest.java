
import org.junit.Before;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GiftCardTest {
    private GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard(100);
    }

    @Test
    public void hasBalance(){
        assertEquals(100, giftCard.getBalance());
    }

}
