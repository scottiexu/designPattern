/**
 * 外观器模式案例：智慧屏
 */
public class Demo {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.goBackHome();
        System.out.println("-------------------------------");
        home.leavekHome();
    }
}
