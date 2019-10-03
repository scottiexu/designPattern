public class Volume_Increase_Command implements Command {
    TV tv;

    public Volume_Increase_Command(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.volume(TV.VolumeSet.increase);
    }
}
