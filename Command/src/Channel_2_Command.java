public class Channel_2_Command implements Command {
    TV tv;

    public Channel_2_Command(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.channel(2);
    }
}
