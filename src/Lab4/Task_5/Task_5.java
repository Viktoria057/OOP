package Lab4.Task_5;
import java.util.Scanner;

public class Task_5 {
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        System.out.println("Circle area = " + calculateArea(radius));

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.println("Area of the rectangle = " + calculateArea(length, width));

        scanner.close();
    }
}
