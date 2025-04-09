package Lab7.Task_4;
import java.util.Scanner;


public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        UserAccount account = new UserAccount("Бред Пітт", "Капібара");

        System.out.println("=== Система входу ===");

        // Спроба входу
        System.out.print("Введіть пароль для входу: ");
        String inputPassword = scanner.nextLine();

        if (account.login(inputPassword)) {
            System.out.println("Вхід успішний! Вітаємо, " + account.getUsername());

            // Меню зміни пароля
            System.out.println("\nБажаєте змінити пароль? (yes/no)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Введіть старий пароль: ");
                String oldPass = scanner.nextLine();

                System.out.print("Введіть новий пароль: ");
                String newPass = scanner.nextLine();

                account.changePassword(oldPass, newPass);
            }
        } else {
            System.out.println("Невірний пароль. Вхід заборонено.");
        }

        scanner.close();
    }
}
