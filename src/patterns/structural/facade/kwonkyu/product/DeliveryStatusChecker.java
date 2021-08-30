package patterns.structural.facade.kwonkyu.product;

public class DeliveryStatusChecker {
    public void findDelivery(String product, String location) {
        System.out.printf("Product '%s' can be delivered to your location '%s'.%n", product, location);
    }
}
