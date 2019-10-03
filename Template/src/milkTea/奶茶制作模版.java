package milkTea;

public abstract class 奶茶制作模版 {

   public void 制作() {
        确认订单();
        准备原料();
        加工();
        包装();
        首款();
        System.out.println("欢迎下次光临～～～～");
    }

    private void 首款() {
        System.out.println("收银并提供产品给顾客");

    }

    private void 包装() {
        System.out.println("装到杯子里");
    }

    protected abstract void 加工();

    protected abstract void 准备原料();

    private void 确认订单() {
        System.out.println("确认订单有效");
    }
}
