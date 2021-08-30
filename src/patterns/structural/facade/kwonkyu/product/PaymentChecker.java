package patterns.structural.facade.kwonkyu.product;

public class PaymentChecker {
    public void checkPayment(String type, int amount) {
        System.out.printf("Paid %d from payment '%s'.%n", amount, type);
    }
}
