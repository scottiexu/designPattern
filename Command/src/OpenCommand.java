public class OpenCommand implements Command {
    TV tv;

    public OpenCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.open();
    }
}
