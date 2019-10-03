public interface Container {
     Iterator getIterator();
     int getSize();

    Object getByIndex(int index);
}