/**
 * 饱含模式线程安全版版，DCL
 */
public class Singleton2 {
    private static volatile Singleton2 singleton;


    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton2 a = Singleton2.getInstance();
        Singleton2 b = Singleton2.getInstance();

        System.out.println(a == b);
    }
}


