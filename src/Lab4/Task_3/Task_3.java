package Lab4.Task_3;
import java.util.Scanner;

public class Task_3 {
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        int result = multiply(a, b);

        System.out.println("Product of two numbers: " + result);

        scanner.close();
    }
}
