package milkTea;

public class 珍珠奶茶 extends 奶茶制作模版 {
    @Override
    protected void 加工() {

        System.out.println("椰果奶绿加工：奶70%，红茶30%、珍珠20颗粒");

    }

    @Override
    protected void 准备原料() {
        System.out.println("椰果奶绿原料：奶、红茶、珍珠");
    }
}
