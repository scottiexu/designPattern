public class Demo {
    public static void main(String[] args) {
        TV tv = new TV();
        Operator operator = new Operator();
        operator.doCommand(new OpenCommand(tv));
        operator.doCommand(new Channel_1_Command(tv));
        operator.doCommand(new Channel_2_Command(tv));
        operator.doCommand(new Volume_decrease_Command(tv));
        operator.doCommand(new CloseCommand(tv));


    }
}
