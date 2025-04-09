package Lab5.Task_2;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;


        do {

            System.out.println("\n=== Меню банківської програми ===");
            System.out.println("1. Перевірити баланс");
            System.out.println("2. Внести кошти");
            System.out.println("3. Зняти кошти");
            System.out.println("4. Вихід");
            System.out.print("Виберіть опцію: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    balance = withdraw(balance, scanner);
                    break;
                case 4:
                    System.out.println("Програма завершена.");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 4);


        scanner.close();
    }


    static void showBalance(double balance) {
        System.out.printf("Поточний баланс: $%.2f\n", balance);
    }

    static double deposit(Scanner scanner) {
        System.out.print("Введіть суму для внесення: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            System.out.printf("Успішно внесено: $%.2f\n", amount);
            return amount;
        } else {
            System.out.println("Сума має бути більшою за 0.");
            return 0;
        }
    }


    static double withdraw(double balance, Scanner scanner) {
        System.out.print("Введіть суму для зняття: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            System.out.printf("Успішно знято: $%.2f\n", amount);
            return balance - amount;
        } else {
            System.out.println("Недостатньо коштів або некоректна сума.");
            return balance;
        }
    }
}

