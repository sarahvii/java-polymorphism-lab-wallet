public class CreditCard extends PaymentCard {

    private Double availableCredit;


    public CreditCard(String cardNumber, String expiryDate, String securityNumber, Double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public Double getAvailableCredit() {
        return availableCredit;
    }

    public String charge() {
        return "Payment made by credit card";
    }
}
