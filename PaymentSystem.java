public class PaymentSystem {
    public static void main(String[] args) {
        Rewardable obj = new CardPayment("123", 500, "1234");

        obj.other();
    }
}

abstract class Payment {

    private String paymentId;
    private double amount;
    private String status;

    Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "PENDING";
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    abstract void processPayment();

    public void showPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
    }
}

interface Refundable {
    void refund();
}

interface Rewardable {
    void addRewardPoints();

    private void print() {
        System.out.println("Hello");
    }

    default void other(){
        print();
    }
}

class UPIPayment extends Payment implements Refundable {

    private String upiId;

    UPIPayment(String paymentId, double amount, String upiId) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI payment using " + upiId);
        setStatus("SUCCESS");
    }

    @Override
    public void refund() {
        System.out.println("Refunding UPI payment");
        setStatus("REFUNDED");
    }
}

class CardPayment extends Payment implements Refundable, Rewardable {

    private String cardNumber;

    CardPayment(String paymentId, double amount, String cardNumber) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing card payment for " + cardNumber);
        setStatus("SUCCESS");
    }

    @Override
    public void refund() {
        System.out.println("Refunding card payment");
        setStatus("REFUNDED");
    }

    @Override
    public void addRewardPoints() {
        System.out.println("Reward points added");
    }
}
