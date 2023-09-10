public abstract class PaymentCard implements IChargeable {

    private String cardNumber;
    private String expiryDate;
    private String securityNumber;

    public PaymentCard(String cardNumber, String expiryDate, String securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getSecurityNumber() {
        return this.securityNumber;
    }

    public abstract String charge();
}
