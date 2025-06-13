package Ticket25.task3;

public class NetworkIssue extends SupportTicket {
    public NetworkIssue(String description, String priority) {
        super(description, priority);
    }

    void process() {
        System.out.println("Обробка мережевої помилки...");
    }

    void getInfo() {
        System.out.println("Мережева заявка: " + description + ", пріоритет: " + priority);
    }
}


