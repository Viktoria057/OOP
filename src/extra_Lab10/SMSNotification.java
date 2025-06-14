package extra_Lab10;

public class SMSNotification extends Notification {

    public SMSNotification(String message) {
        super("[SMS] " + message);
    }

    @Override
    public void send() {
        Storage.addMessage(this.message);
        System.out.println("Sending SMS: " + this.message);
    }
}
