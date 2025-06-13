package Ticket25.task3;

public class HardwareIssue extends SupportTicket {
    public HardwareIssue(String description, String priority) {
        super(description, priority);
    }

    void process() {
        System.out.println("Обробка апаратної помилки...");
    }

    void getInfo() {
        System.out.println("Апаратна заявка: " + description + ", пріоритет: " + priority);
    }
}

