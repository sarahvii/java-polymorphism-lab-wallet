public class GiftCard implements IChargeable {

    private double balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void charge(double purchaseAmount) {

//        return "Payment made by gift card";
    }
}
