public class Duck {
    State state;

    //穷举所有状态
    State hungeryState;
    State happyState;

    public Duck(){
        happyState = new HappyState(this);
        hungeryState = new HungeryState(this);
        this.state = happyState;
        System.out.println("我是一只鸭子，我刚出生");
    }
    void speak() {
        System.out.println("I'm " + state);
    }

    void eat(){
        state.eat();
    }

    void running(){
        state.running();
    }
}
