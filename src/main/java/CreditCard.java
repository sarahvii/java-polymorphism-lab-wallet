public class CreditCard extends PaymentCard {

    private double availableCredit;

    public CreditCard(String cardNumber, String expiryDate, String securityNumber, double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void charge(double purchaseAmount) {
        double purchaseAmountWithInterest = purchaseAmount * 1.05;
        if (purchaseAmountWithInterest > this.availableCredit) {
            System.out.println("You have insufficient credit");
            return;
        }
        this.availableCredit -= purchaseAmountWithInterest;
        String logPayment = String.format("%s has been charged, you have %s credit remaining", purchaseAmountWithInterest, availableCredit);
        System.out.println(logPayment);
    }

}
