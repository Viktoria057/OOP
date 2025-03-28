package Lab4.Task_11;
import java.util.Scanner;

public class Task_11 {
    static void findMax(int... numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++ ) {
            System.out.print("Enter" + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        findMax(numbers);

        scanner.close();
    }
}
