public class HappyState implements State {
    Duck duck;

    public HappyState(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "happy";
    }

    @Override
    public void eat() {
       System.out.println("吃东西，没有改变我的状态");

    }

    @Override
    public void running() {
        System.out.println("跑步，让我改变状态了");
        duck.state = duck.hungeryState;
    }
}
