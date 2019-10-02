import java.util.ArrayList;
import java.util.List;

public class NonleafNode implements Node {


    private String name;
    private List<Node> children;


    public NonleafNode(String name) {
        this.children = new ArrayList<Node>();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void addChildren(Node node) {
        children.add(node);
    }

    @Override
    public void removeChildren(Node node) {
        children.remove(node);
    }

    @Override
    public void print(String indentation) {
        System.out.println(indentation + name);
        indentation = indentation + "----";
        for (Node node : children) {
            node.print(indentation);
        }
    }
}
