package patterns.structural.facade.kwonkyu.product;

public class ProductStockChecker {
    public void check(String product, int count) {
        System.out.printf("Product '%s' has %d items.%n", product, count);
    }
}
