package DIP.correct;

import org.junit.Test;

class ElectricPowerSwitchTest {
    @Test
    public void testPress() throws Exception {
        /*Old method*/
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();



        /*New method*/
        Fan switchableFan=new Fan();
        switchableFan.turnOn();
        switchableFan.increase();
        switchableFan.decrease();
        switchableFan.turnOff();
    }
}
