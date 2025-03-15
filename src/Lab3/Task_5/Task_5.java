package Lab3.Task_5;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Enter the array size: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100) + 1;
            }
            System.out.print("Array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }

