package Lab1.Task_4;
import java.util.Scanner;

public class Task_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age:");
            byte age = scanner.nextByte();
            boolean isAdult = age >= 18;
            System.out.print("Full-year :)" + isAdult);
            scanner.close();
        }
    }

