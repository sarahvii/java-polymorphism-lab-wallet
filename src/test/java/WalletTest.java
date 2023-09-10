import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    private Wallet wallet;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private GiftCard giftCard;


    @Before
    public void before() {
        wallet = new Wallet("Jimmy");
        creditCard = new CreditCard("1234 5678 9012", "09/25", "928", 1000.00);
        debitCard = new DebitCard("2345 6789 1927 2830", "08/25", "478", "09827489", "878787", 500.00);
        giftCard = new GiftCard(50);
    }

    @Test
    public void walletHasOwner() {
        assertEquals("Jimmy", wallet.getOwner());
    }

    @Test
    public void walletStartsEmpty() {
        assertEquals(0, wallet.getNumberOfItems());
    }

    @Test
    public void debitCardCanBeAddedToWallet() {
        wallet.addItem(debitCard);
        assertEquals(1, wallet.getNumberOfItems());
    }

    @Test
    public void cardsOfDifferentTypesCanBeAddedToWallet() {
        wallet.addItem(debitCard);
        wallet.addItem(creditCard);
        wallet.addItem(giftCard);
        assertEquals(3, wallet.getNumberOfItems());
    }

    @Test
    public void canSelectCard() {
        wallet.addItem(creditCard);
        wallet.setSelectedCard(creditCard);
        assertEquals(creditCard, wallet.getSelectedCard());
    }

    @Test
    public void canPayWithSelectedCard() {
        wallet.addItem(debitCard);
        wallet.setSelectedCard(debitCard);
        wallet.payWithSelectedCard(50);
        assertEquals(450.00, debitCard.getBalance(), 0.01);
    }


}
