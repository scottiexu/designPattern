/**
 * 状态器模式案例：状态机
 */
public class Demo {
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.speak();

        duck.running();
        duck.speak();

        duck.eat();
        duck.speak();

        duck.eat();
        duck.speak();

        duck.running();
        duck.speak();

        duck.running();
        duck.speak();
    }
}
