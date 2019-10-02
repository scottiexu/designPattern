package abstractFactory;

import goods.BGoods;
import goods.Goods;
import product.BProduct;
import product.Product;

public class BFactory implements  AbstractFactory {

    @Override
    public Product createProduct() {
        return new BProduct();
    }

    @Override
    public Goods createGoods() {
        return new BGoods();
    }
}
