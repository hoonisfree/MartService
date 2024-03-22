package paymentMethod;

public abstract class PaymentMethod {
    public int price;

    public PaymentMethod(int price) {
        this.price = price;
    }
}
