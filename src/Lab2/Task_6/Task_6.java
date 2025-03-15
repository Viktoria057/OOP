package Lab2.Task_6;
import java.util.Scanner;

public class Task_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your number:");
            double num = scanner.nextDouble();

            System.out.printf("Square root: %.2f%n", Math.sqrt(num));
            System.out.println("Rounded value: " + Math.round(num));
            System.out.printf("Squared: %.2f%n", Math.pow(num, 2));
            System.out.printf("Sine of a number: %.2f%n", Math.sin(num));

            scanner.close();
        }
    }
