package Ticket25.task3;

public abstract class SupportTicket {
    String description;
    String priority;

    public SupportTicket(String description, String priority) {
        this.description = description;
        this.priority = priority;
    }

    abstract void process();
    abstract void getInfo();
}
