package Lab2.Task_3;
import java.util.Scanner;

public class Task_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int max;
            if (a > b) {
                max = a;
            } else {
                max = b;
            }

            System.out.println("Max number: " + max);

            scanner.close();
        }
    }

