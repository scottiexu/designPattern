public class CloseCommand implements Command {
    TV tv;

    public CloseCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.close();
    }
}
