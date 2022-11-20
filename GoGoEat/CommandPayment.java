package GoGoEat;

public abstract class CommandPayment implements Commands {
    protected double discountPrice;
    protected Payment payment;

    public CommandPayment(Payment payment, double discountPrice) {
        this.payment = payment;
        this.discountPrice = discountPrice;
    }
}
