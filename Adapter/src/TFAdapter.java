public class TFAdapter implements USBDisk {

    TFCard tfCard;
    public TFAdapter(TFCard tfCard){
        this.tfCard = tfCard;
    }
    @Override
    public void getContent() {
        tfCard.read();
    }
}
