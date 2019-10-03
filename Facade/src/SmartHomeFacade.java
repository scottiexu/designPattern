public class SmartHomeFacade {
    CDPlayer cdPlayer;
    AirCondition airCondition;
    Light light;

    public SmartHomeFacade() {

        cdPlayer = new CDPlayer();
        airCondition = new AirCondition();
        light = new Light();
    }

    void goBackHome() {
        System.out.println("SmartHome: Welcome back home master, setting your home now...");
        light.on();
        airCondition.on();
        airCondition.setTemperature(22);
        cdPlayer.on();
        cdPlayer.setVolume(60);
        System.out.println("SmartHome: Setup completed");
    }

    void leavekHome() {
        System.out.println("SmartHome: All equipment will shut down... ");
        light.off();
        airCondition.off();
        cdPlayer.off();
        System.out.println("SmartHome: Setup completed, see you master ");

    }
}
