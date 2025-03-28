package Lab4.Task_9;
import java.util.Scanner;



public class Task_9 {
    static void sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        System.out.println("The sum of the numbers is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++ ) {
            System.out.print("Enter " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        sum(numbers);

        scanner.close();
    }
}
