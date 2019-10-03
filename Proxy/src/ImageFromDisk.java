public class ImageFromDisk implements Image {
    @Override
    public void load() {
        System.out.println("loading image from disk");

    }

    @Override
    public void show() {
        System.out.println("this is a picture");
    }
}
