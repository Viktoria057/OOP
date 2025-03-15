package Lab3.Task_8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(1, 100);
            }

            System.out.println("Our array: " + Arrays.toString(array));

            System.out.print("Enter the number you are looking for: ");
            int searchNum = scanner.nextInt();

            boolean found = false;
            for (int num : array) {
                if (num == searchNum) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Число знайдено!");
            } else {
                System.out.println("Число не знайдено(");
            }

            scanner.close();
        }
    }
