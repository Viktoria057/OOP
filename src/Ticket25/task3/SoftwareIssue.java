package Ticket25.task3;

public class SoftwareIssue extends SupportTicket {
    public SoftwareIssue(String description, String priority) {
        super(description, priority);
    }

    void process() {
        System.out.println("Обробка програмної помилки...");
    }

    void getInfo() {
        System.out.println("Програмна заявка: " + description + ", пріоритет: " + priority);
    }
}
