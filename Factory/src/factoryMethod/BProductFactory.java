package factoryMethod;

import product.BProduct;
import product.Product;

public class BProductFactory implements Factory {
    @Override
    public Product createProduct() {
        return new BProduct();
    }
}
