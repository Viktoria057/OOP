package Lab4.Task_4;
import java.util.Scanner;

public class Task_4 {
    static void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        printInfo(name);
        printInfo(name, age);

        scanner.close();
    }
}
