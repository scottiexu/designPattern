package abstractFactory;

import goods.AGoods;
import goods.Goods;
import product.AProduct;
import product.Product;

public class AFactory implements  AbstractFactory {

    @Override
    public Product createProduct() {
        return new AProduct();
    }

    @Override
    public Goods createGoods() {
        return new AGoods();
    }
}
