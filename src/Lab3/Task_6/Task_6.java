package Lab3.Task_6;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " array element: ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;
        int evenNumber = 0;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            sum += num;

            if (num % 2 == 0) {
                evenNumber++;
            }
        }

        double averageNum = (double) sum / n;

        System.out.println("Minimum array element: " + min);
        System.out.println("Maximum array element: " + max);
        System.out.println("The average value of the elements in the array: " + averageNum);
        System.out.println("Number of even numbers in the array: " + evenNumber);

        scanner.close();
    }
}

