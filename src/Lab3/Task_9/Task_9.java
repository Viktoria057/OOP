package Lab3.Task_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 100);
        }
        System.out.println("Massif: " + Arrays.toString(a));

        System.out.println("What index of the element will you find?");
        int j = scanner.nextInt();
        System.out.println("What is the new meaning?");
        a[j] = scanner.nextInt();

        System.out.println("Massif: " + Arrays.toString(a));

        scanner.close();
    }
}

