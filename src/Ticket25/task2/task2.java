package Ticket25.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        final String correctPassword = "78567";
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Введіть пароль: ");
            String input = scanner.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Доступ дозволено");
                return;
            } else {
                System.out.println("Неправильний пароль. Спроб залишилось: " + (2 - attempts));
            }

            attempts++;
        }

        System.out.println("Доступ заборонено");
    }
}

