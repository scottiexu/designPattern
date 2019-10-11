/**
 * 组合模式案例：树结构
 */
public class Demo {

    public static void main(String[] args) {
        Node node0 = new NonleafNode("node0");
        Node node1 = new NonleafNode("node1");
        Node node2 = new NonleafNode("node2");
        Node node3 = new NonleafNode("node3");
        Node node4 = new NonleafNode("node4");
        Node node5 = new NonleafNode("node5");
        Node node6 = new NonleafNode("node6");
        Node node7 = new NonleafNode("node7");
        Node leaf1 = new LeafNode("leaf1");
        Node leaf2 = new LeafNode("leaf2");
        Node leaf3 = new LeafNode("leaf3");

        node7.addChildren(leaf1);
        node7.addChildren(leaf2);
        node6.addChildren(leaf3);
        node5.addChildren(node6);
        node5.addChildren(node7);
        node2.addChildren(node5);
        node2.addChildren(node4);
        node2.addChildren(node3);
        node0.addChildren(node2);
        node0.addChildren(node1);

        node0.print("");

    }
}
