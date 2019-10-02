package abstractFactory;

import goods.Goods;
import product.Product;

public interface AbstractFactory {

    Product createProduct();

    Goods createGoods();
}
