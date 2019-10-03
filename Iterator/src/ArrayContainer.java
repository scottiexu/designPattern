public class ArrayContainer implements Container {
    private Iterator iterator;
    private String[] arg = {"A", "B", "C", "D", "E"};

    public ArrayContainer() {
        iterator = new ArrayIterator(this);

    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }

    @Override
    public int getSize() {
        return arg.length;
    }

    @Override
    public Object getByIndex(int index) {
        return arg[index];
    }
}
