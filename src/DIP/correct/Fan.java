package DIP.correct;

class Fan implements Switchable,Adjustable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }

    @Override
    public void increase() {

    }

    @Override
    public void decrease() {

    }
}
