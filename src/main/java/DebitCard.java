public class DebitCard extends PaymentCard {

    private String accountNumber;
    private String sortCode;

    public DebitCard(String cardNumber, String expiryDate, String securityNumber, String accountNumber, String sortCode) {
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getSortCode() {
        return this.sortCode;
    }

    public String charge() {
        return "Payment made by debit card";
    }
}
