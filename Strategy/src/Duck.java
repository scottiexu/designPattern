public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior fly, QuackBehavior quack) {
        this.flyBehavior = fly;
        this.quackBehavior = quack;
    }

    void doFly() {
        flyBehavior.action();
    }

    ;

    void doQuack() {
        quackBehavior.action();
    }

    ;


    public static void main(String[] args) {
        Duck duck = new Duck(new FlyBehavior1(), new QuackBehavior2());
        duck.doFly();
        duck.doQuack();
    }
}
