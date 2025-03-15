package Lab2.Task_5;
import java.util.Scanner;

public class Task_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the string:");
            String input = scanner.nextLine();
            System.out.println("String length" +input.length());
            if (input.length() > 0) {
                System.out.println("First character" +input.charAt(0));
                System.out.println("Last character" +input.charAt(input.length() -1));
            }
            System.out.println("Upper case:" +input.toUpperCase());
            System.out.println("Lower case" +input.toLowerCase());
            if (input.length() >=3) {
                System.out.println("Substring:" +input.substring(0,3));
            }
            System.out.println("Contains (Java):" +input.contains("Java"));
            scanner.close();
        }
    }
