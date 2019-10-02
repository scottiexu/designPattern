/**
 * 饿含模式
 */
public class Singleton4 {
    private static volatile Singleton4 singleton = new Singleton4();


    private Singleton4() {
    }

    public static Singleton4 getInstance() {

        return singleton;
    }

    public static void main(String[] args) {
        Singleton4 a = Singleton4.getInstance();
        Singleton4 b = Singleton4.getInstance();

        System.out.println(a == b);
    }
}


