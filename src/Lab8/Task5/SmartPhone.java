package Lab8.Task5;

public class SmartPhone extends Phone {
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("SmartPhone is now on.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}
