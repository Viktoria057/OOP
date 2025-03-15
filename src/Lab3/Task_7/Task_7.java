package Lab3.Task_7;
import java.util.Arrays;
import java.util.Random;

public class Task_7 {
        public static void main(String[] args) {
            Random random = new Random();

            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(1, 100);
            }

            System.out.println("Initial array: " + Arrays.toString(array));

            Arrays.sort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }

