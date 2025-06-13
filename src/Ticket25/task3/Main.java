package Ticket25.task3;

public class Main {
    public static void main(String[] args) {
        SupportTicket[] tickets = {
                new SoftwareIssue("Не запускається Word", "Високий"),
                new HardwareIssue("Поламався монітор", "Середній"),
                new NetworkIssue("Інтернет не працює", "Високий")
        };

        for (SupportTicket ticket : tickets) {
            ticket.getInfo();
            ticket.process();
            System.out.println();
        }
    }
}
