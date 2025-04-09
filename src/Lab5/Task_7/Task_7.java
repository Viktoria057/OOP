package Lab5.Task_7;
import java.util.Scanner;
import java.util.Random;

public class Task_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int balance = 100;
            System.out.println("Ласкаво просимо до гри Слот-машина!");
            System.out.println("Ваш початковий баланс: $" + balance);

            while (balance > 0) {
                System.out.println("Ваш поточний баланс: $" + balance);
                System.out.print("Введіть суму ставки: ");
                int bet = scanner.nextInt();
                scanner.nextLine();

                if (bet <= 0) {
                    System.out.println("Ставка має бути більше нуля.");
                    continue;
                }

                if (bet > balance) {
                    System.out.println("Недостатньо коштів.");
                    continue;
                }

                balance -= bet;
                String[] row = spinRow();
                printRow(row);

                int payout = getPayout(row, bet);
                if (payout > 0) {
                    System.out.println("Ви виграли $" + payout + "!");
                    balance += payout;
                } else {
                    System.out.println("Нажаль, ви програли.");
                }

                if (balance == 0) {
                    System.out.println("Ваш баланс дорівнює нулю. Гру завершено.");
                    break;
                }

                System.out.print("Бажаєте зіграти ще раз? (Y/N): ");
                String again = scanner.nextLine().toUpperCase();
                if (!again.equals("Y")) {
                    break;
                }
            }

            System.out.println("Дякуємо за гру!");
            scanner.close();
        }

        static String[] spinRow() {
            String[] symbols = {"@", "#", "$", "%", "&"};
            Random random = new Random();
            String[] row = new String[3];
            for (int i = 0; i < 3; i++) {
                row[i] = symbols[random.nextInt(symbols.length)];
            }
            return row;
        }

        static void printRow(String[] row) {
            System.out.println("+---+---+---+");
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
            System.out.println("+---+---+---+");
        }

        static int getPayout(String[] row, int bet) {
            if (row[0].equals(row[1]) && row[1].equals(row[2])) {
                return bet * 5;
            } else if (row[0].equals(row[1]) ||  row[0].equals(row[2]) || row[1].equals(row[2])) {
                return bet * 2;
            } else {
                return 0;
            }
        }
    }

