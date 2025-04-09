package Lab5.Task_3;
import java.util.Scanner;

public class Task_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть оператор (+, -, *, /, ^): ");
            String operator = scanner.next();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Результат: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Результат: " + result);
                    } else {
                        System.out.println("Помилка: ділення на нуль.");
                    }
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    System.out.println("Результат: " + result);
                    break;
                default:
                    System.out.println("Помилка: некоректний оператор.");
            }

            scanner.close();
        }
    }

