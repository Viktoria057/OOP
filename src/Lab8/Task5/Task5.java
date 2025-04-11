package Lab8.Task5;

public class Task5 {
    public static void main(String[] args) {
    Phone phone = new Phone();
    phone.turnOn();
    phone.makeCall();

    System.out.println();

    Tablet tablet = new Tablet();
    tablet.turnOn();
    tablet.watchVideo();

    System.out.println();

    SmartPhone smartPhone = new SmartPhone();
    smartPhone.turnOn();
    smartPhone.makeCall();
    smartPhone.browseInternet();
}
}
