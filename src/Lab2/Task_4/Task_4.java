package Lab2.Task_4;
import java.util.Scanner;

public class Task_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name:");
            String name = scanner.next();
            System.out.print("Enter your age:");
            int age = scanner.nextInt();
            System.out.println("Your name: " +name);
            System.out.println("Your age :" +age);

            scanner.close();
        }
    }

