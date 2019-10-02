/**
 * 静态内部类版本，线程安全
 */
public class Singleton3 {

    private static class Singleton3Inner {
        private static Singleton3 singleton = new Singleton3();
        private Singleton3Inner() {
        }
    }

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return Singleton3Inner.singleton;
    }


    public static void main(String[] args) {
        Singleton3 a = Singleton3.getInstance();
        Singleton3 b = Singleton3.getInstance();

        System.out.println(a == b);
    }
}
