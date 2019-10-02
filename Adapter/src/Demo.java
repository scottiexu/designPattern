public class Demo {
    public static void main(String[] args) {
        Computer com = new Computer();
        USBDisk USBDisk = new USBDisk1();
        com.readUSBDisk(USBDisk);

        TFCard tfCard = new TFCard();
        USBDisk tFAdapter = new TFAdapter(tfCard);
        com.readUSBDisk(tFAdapter);
    }
}
