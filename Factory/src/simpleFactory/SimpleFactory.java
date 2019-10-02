package simpleFactory;

import product.*;

public class SimpleFactory {
    public static Product createProduct(String type) throws Exception {
        switch (type) {
            case "A":
                return new AProduct();
            case "B":
                return new BProduct();
            default:
                throw new Exception();
        }
    }


}
