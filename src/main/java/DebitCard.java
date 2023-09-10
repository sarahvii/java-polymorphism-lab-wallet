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
        if (purchaseAmount > balance) {
            System.out.println("You have insufficient funds");
            return;
        }
        this.balance -= purchaseAmount;
        String logPayment = String.format("%s has been charged, you have %s remaining", purchaseAmount, balance);
        System.out.println(logPayment);

    }
}
