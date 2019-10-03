public class ArrayIterator implements Iterator {

    Container container;
    int index ;

    public ArrayIterator(Container container) {
        this.container = container;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < container.getSize();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return container.getByIndex(index++);
        }
        return null;
    }
}
