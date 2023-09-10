public class GiftCard implements IChargeable {

    private double balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void charge(double purchaseAmount) {
        if (purchaseAmount > balance) {
            System.out.println("Balance is insufficient");
            return;
        }
        this.balance -= purchaseAmount;
    }
}
