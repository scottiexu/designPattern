public class Duck {
    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior fly) {
        System.out.println("I'm a duck");
        this.flyBehavior = fly;
    }

    void doFly() {
        flyBehavior.action();
    }


}
