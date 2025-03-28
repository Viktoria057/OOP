package Lab4.Task_2;
import java.util.Scanner;
public class Task_2 {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        System.out.println("The sum of two numbers: " + sum(a, b));

        scanner.close();
    }
}
