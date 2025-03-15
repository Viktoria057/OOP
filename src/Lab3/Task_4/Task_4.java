package Lab3.Task_4;
import java.util.Scanner;

public class Task_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your number n: ");
            int n = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum number from 1 to " + n + " = " + sum);
        }
    }

