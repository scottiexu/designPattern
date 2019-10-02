package factoryMethod;

import product.AProduct;
import product.Product;

public class AProductFactory implements Factory {
    @Override
    public Product createProduct() {
        return new AProduct();
    }
}
