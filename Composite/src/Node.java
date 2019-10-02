public interface Node {


    String getName();

    void addChildren(Node node);

    void removeChildren(Node node);

    void print(String indentation);
}
