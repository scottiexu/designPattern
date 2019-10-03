public class HungeryState implements State {
    Duck duck;

    public HungeryState(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "hungery";
    }

    @Override
    public void eat() {
        System.out.println("吃东西，让我改变状态了");
        duck.state = duck.happyState;
    }

    @Override
    public void running() {
        System.out.println("跑步，没有改变我的状态");
    }
}
