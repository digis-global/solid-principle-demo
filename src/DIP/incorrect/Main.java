package DIP.incorrect;

public class Main {
    void run() {
        LightBulb lightBulb = new LightBulb();
        ElectricPowerSwitch electricPowerSwitch = new ElectricPowerSwitch(lightBulb);

        electricPowerSwitch.isOn();
        electricPowerSwitch.press();
    }
}
