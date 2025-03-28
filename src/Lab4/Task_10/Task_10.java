package Lab4.Task_10;
import java.util.Scanner;

public class Task_10 {
    static void printNumbers(String message, int... numbers) {
        System.out.println("Message: " + message);
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        System.out.print("Enter the number of numbers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++ ) {
            System.out.print("Enter" + (i + 1) + " Number: ");
            numbers[i] = scanner.nextInt();
        }

        printNumbers(message, numbers);

        scanner.close();
    }
}
