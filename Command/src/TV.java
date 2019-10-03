public class TV {


    void open() {
        System.out.println("open");
    }

    void close() {
        System.out.println("close");
    }

    void channel(int channel) {
        System.out.println("channel" + channel);
    }

    void volume(VolumeSet set) {
        System.out.println("volume " + set.name);
    }
    enum VolumeSet {
        increase("+"),
        decrease("-");
        private String name;
        //构造函数
        VolumeSet(String name) {
            this.name = name;
        }
    }
}
