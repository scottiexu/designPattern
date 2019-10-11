/**
 * 策略模式案例：鸭子飞行行为
 */
public class Demo {

    public static void main(String[] args) {
        Duck duck = new Duck(new FlyBehavior1());
        duck.doFly();
         duck = new Duck(new FlyBehavior2());
        duck.doFly();
    }}
