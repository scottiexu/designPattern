public class Channel_1_Command implements Command {
    TV tv;

    public Channel_1_Command(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.channel(1);
    }
}
