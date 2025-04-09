package Lab5.Task_6;
import java.util.Scanner;
import java.util.Random;

public class Task_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] options = {"rock", "paper", "scissors"};
            Random random = new Random();
            String playAgain;

            do {
                String playerChoice;
                while (true) {
                    System.out.print("Введіть ваш вибір (rock, paper, scissors): ");
                    playerChoice = scanner.nextLine().toLowerCase();
                    if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                        break;
                    }
                    System.out.println("Некоректний ввід. Спробуйте ще раз.");
                }

                String computerChoice = options[random.nextInt(3)];
                System.out.println("Комп’ютер вибрав: " + computerChoice);

                if (playerChoice.equals(computerChoice)) {
                    System.out.println("Нічия!");
                } else if (
                        (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                                (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                                (playerChoice.equals("paper") && computerChoice.equals("rock"))
                ) {
                    System.out.println("Ви перемогли!");
                } else {
                    System.out.println("Комп’ютер переміг!");
                }

                System.out.print("Бажаєте зіграти ще раз? (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();
            } while (playAgain.equals("yes"));

            System.out.println("Thanks for playing!");
            scanner.close();
        }
    }
