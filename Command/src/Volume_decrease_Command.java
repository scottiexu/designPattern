public class Volume_decrease_Command implements Command {
    TV tv;

    public Volume_decrease_Command(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.volume(TV.VolumeSet.decrease);
    }
}
