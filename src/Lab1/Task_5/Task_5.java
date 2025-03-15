package Lab1.Task_5;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name:");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    byte age = scanner.nextByte();
    System.out.print("Enter your height: ");
    double height =scanner.nextDouble();
    System.out.print("Are you a student?: ");
    boolean student = scanner.nextBoolean();
    System.out.println("\n user information:");
    System.out.println("Name: " + name);
    System.out.println("age: " + age);
    System.out.println("Height: " + height );
    System.out.println("Student: " + student);

    scanner.close();
}
}

