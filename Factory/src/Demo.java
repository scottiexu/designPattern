import abstractFactory.*;
import factoryMethod.*;
import goods.Goods;
import simpleFactory.SimpleFactory;
import product.Product;

public class Demo {
    public static void main(String[] args) throws Exception {

        //simpleFactory
        System.out.println("-----simpleFactory-----");

        Product p1 = SimpleFactory.createProduct("A");
        Product p2 = SimpleFactory.createProduct("B");
        p1.sayhello();
        p2.sayhello();
        //factoryMethod
        System.out.println("-----factoryMethod-----");


        Product p3 = new AProductFactory().createProduct();
        Product p4 = new BProductFactory().createProduct();
        p3.sayhello();
        p4.sayhello();

        //abstractFactory
        System.out.println("-----abstractFactory-----");
        AbstractFactory afactory = new AFactory();
        AbstractFactory bfactory = new BFactory();
        Product p5 = afactory.createProduct();
        Goods g1 = afactory.createGoods();
        Product p6 = bfactory.createProduct();
        Goods g2 = bfactory.createGoods();

        p5.sayhello();
        g1.showInfo();
        p6.sayhello();
        g2.showInfo();
    }
}
