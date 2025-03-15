package Lab3.Task_2;
import java.util.Scanner;

public class Task_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int secretNumber = 7; // Загадане число
            int guess;

            do {
                System.out.print("Enter your number: ");
                guess = scanner.nextInt();
            } while (guess != secretNumber);

            System.out.println("You guessed it!");
        }
    }

