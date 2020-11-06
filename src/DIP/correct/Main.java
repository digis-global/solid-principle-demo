package DIP.correct;

public class Main {
    void run() {
        LightBulb lightBulb = new LightBulb();
        lightBulb.turnOn();
        lightBulb.turnOff();

        Fan fan = new Fan();
        fan.turnOn();
        fan.increase();
        fan.increase();
        fan.turnOff();
    }
}
