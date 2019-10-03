public class ImageFromWeb implements Image {
    ImageFromDisk image;

    public ImageFromWeb() {
        image = new ImageFromDisk();
    }

    @Override
    public void load() {
        image.load();
        System.out.println("transfer image on network");
    }

    @Override
    public void show() {
        image.show();
    }
}
