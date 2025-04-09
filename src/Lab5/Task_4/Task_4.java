package Lab5.Task_4;
import java.util.Scanner;
import java.util.Random;

public class Task_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Введіть кількість кубиків: ");
            int numDice = scanner.nextInt();

            if (numDice <= 0) {
                System.out.println("Помилка: кількість має бути більшою за 0.");
                scanner.close();
                return;
            }

            int total = 0;

            for (int i = 1; i <= numDice; i++) {
                int roll = random.nextInt(6) + 1;
                print(roll);
                total += roll;
            }

            System.out.println("Загальна сума: " + total);
            scanner.close();
        }

        static void print(int roll) {
            switch (roll) {
                case 1:
                    System.out.println("[     ]\n[  *  ]\n[     ]");
                    break;
                case 2:
                    System.out.println("[*    ]\n[     ]\n[    *]");
                    break;
                case 3:
                    System.out.println("[*    ]\n[  *  ]\n[    *]");
                    break;
                case 4:
                    System.out.println("[*   *]\n[     ]\n[*   *]");
                    break;
                case 5:
                    System.out.println("[*   *]\n[  *  ]\n[*   *]");
                    break;
                case 6:
                    System.out.println("[*   *]\n[*   *]\n[*   *]");
                    break;
            }
        }
    }

