public class ChristmasTree implements Tree {
    Tree tree;

    public ChristmasTree(Tree tree) {
        this.tree = tree;
    }

    @Override
    public void show() {
        System.out.println("灯");
        System.out.println("礼物");
        tree.show();
    }
}
