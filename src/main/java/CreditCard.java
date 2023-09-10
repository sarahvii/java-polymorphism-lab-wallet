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
//        return "Payment made by credit card";
    }

}
