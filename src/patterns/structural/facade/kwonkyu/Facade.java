package patterns.structural.facade.kwonkyu;

import patterns.structural.facade.kwonkyu.client.ProductOrderService;

public class Facade {
    public static void test() {
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.order("Pumpkin", 5, "VISA card", 1000, "South Korea");
    }
}
