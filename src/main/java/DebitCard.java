public class DebitCard extends PaymentCard {

    private String accountNumber;
    private String sortCode;

    private double balance;

    public DebitCard(String cardNumber, String expiryDate, String securityNumber, String accountNumber, String sortCode, double balance) {
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getSortCode() {
        return this.sortCode;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(double purchaseAmount) {
//        return "Payment made by debit card";
    }
}
