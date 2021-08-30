package patterns.structural.facade.kwonkyu.client;

import patterns.structural.facade.kwonkyu.product.DeliveryStatusChecker;
import patterns.structural.facade.kwonkyu.product.PaymentChecker;
import patterns.structural.facade.kwonkyu.product.ProductStockChecker;

public class ProductOrderService {

    private static final ProductStockChecker stock = new ProductStockChecker();
    private static final DeliveryStatusChecker delivery = new DeliveryStatusChecker();
    private static final PaymentChecker pay = new PaymentChecker();

    public void order(String product, int amount, String paymentType, int price, String location) {
        stock.check(product, amount);
        delivery.findDelivery(product, location);
        pay.checkPayment(paymentType, price * amount);
    }
}
