package Lab3.Task_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an array а[" + i + "]  element: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Massif: " + Arrays.toString(a));
        System.out.print("All duplicates in an array: ");

        for (int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++){
                if(a[i] == a[j]){
                    System.out.print(a[i] + " ");
                    break;
                }

            }
        }
    }
}
