package Lab7.Task_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер рахунку:");

        int InitializationAccount = scanner.nextInt();
        Account bank = new Account(InitializationAccount);

        System.out.print("Введіть свій баланс:");
        bank.setBalance(scanner.nextDouble());

        System.out.println("Ваш поточний баланс: " + bank.getBalance());
        System.out.println("Скільки будете класти на свій рахунок?");
        bank.deposit(scanner.nextDouble());

        System.out.println("Скільки будете знімати з рахунку?");
        bank.withdraw(scanner.nextDouble());

        scanner.close();
    }
}
