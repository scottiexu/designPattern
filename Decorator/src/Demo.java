/**
 * 装饰模式案例：圣诞树
 */
public class Demo {
    public static void main(String[] args) {
        Tree pinetree = new PineTree();
        pinetree.show();
        System.out.println("--------下面松树被装饰成了圣诞树---------------");
        pinetree = new ChristmasTree(pinetree);
        pinetree.show();
    }
}
