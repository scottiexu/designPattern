public class LeafNode implements Node {

    private String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addChildren(Node node) {
        System.out.println("Error");
    }

    @Override
    public void removeChildren(Node node) {
        System.out.println("Error");
    }

    @Override
    public void print(String indentation) {
        System.out.println(indentation + name);
    }
}
