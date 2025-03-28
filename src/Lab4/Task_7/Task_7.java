package Lab4.Task_7;
import java.util.Scanner;

public class Task_7 {
    static int counter = 0;

    static void increment() {
        counter += 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of increments: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++ ) {
            increment();
        }

        System.out.println("The value of counter after " + count + " challenges: " + counter);

        scanner.close();
    }
}
