/**
 * 代理模式案例：远程代理
 */public class Demo {
    public static void main(String[] args) {
        Image image = new ImageFromDisk();
        image.load();
        image.show();
        System.out.println("------------------");
        Image image1 = new ImageFromWeb();
        image1.load();
        image1.show();
    }
}
