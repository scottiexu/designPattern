import java.util.ArrayList;
import java.util.List;

public class NonleafNode implements Node {


    private String name;
    private List<Node> childrens;


    public NonleafNode(String name) {
        this.childrens = new ArrayList<Node>();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void addChildren(Node node) {
        childrens.add(node);
    }

    @Override
    public void removeChildren(Node node) {
        childrens.remove(node);
    }

    @Override
    public void print(String indentation) {
        System.out.println(indentation + name);
        indentation = indentation + "----";
        for (Node node : childrens) {
            node.print(indentation);
        }
    }
}
