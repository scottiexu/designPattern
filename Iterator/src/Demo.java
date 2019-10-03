public class Demo {
    public static void main(String[] args) {
        Container arrayContainer = new ArrayContainer();
        Iterator iterator = arrayContainer.getIterator();

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());



    }
}
