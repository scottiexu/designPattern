/**
 * 饱含模式线程不安全版版
 */
public class Singleton1 {
    private static Singleton1 singleton;


    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton1 a = Singleton1.getInstance();
        Singleton1 b = Singleton1.getInstance();

        System.out.println(a==b);
    }
}


