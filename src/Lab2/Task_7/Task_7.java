package Lab2.Task_7;
import java.util.Scanner;
import java.util.Random;

public class Task_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Enter the minimum value: ");
            int min = scanner.nextInt();

            System.out.print("Enter the maximum value: ");
            int max = scanner.nextInt();

            if (min > max) {
                System.out.println("Error: Minimum value is greater than maximum.");
            } else {
                int randomNum = random.nextInt(max - min + 1) + min;

                String parity = (randomNum % 2 == 0) ? "in pairs" : "Odd";

                System.out.printf("Generated number: %d\n", randomNum);
                System.out.printf("Number %d є %s.\n", randomNum, parity);
            }

            scanner.close();
        }
    }

