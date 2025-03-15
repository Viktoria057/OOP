package Lab2.addTask;
import java.util.Scanner;

public class addTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        int atSign = email.indexOf("@");

        String username = email.substring(0, atSign);
        String domain = email.substring(atSign + 1);

        System.out.println("User name: " + username);
        System.out.println("domain: " + domain);

        scanner.close();
    }
}
