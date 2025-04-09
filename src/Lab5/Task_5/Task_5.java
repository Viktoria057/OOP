package Lab5.Task_5;
import java.util.Scanner;

public class Task_5 {
        public static void main(String[] args) {
            String[] questions = {
                    "Яка столиця Франції?",
                    "Скільки буде 3 * 4?",
                    "Яка мова програмування має розширення .java?"
            };

            String[][] options = {
                    {"1. Берлін", "2. Париж", "3. Мадрид"},
                    {"1. 7", "2. 12", "3. 15"},
                    {"1. Python", "2. C++", "3. Java"}
            };

            int[] answers = {2, 2, 3};

            Scanner scanner = new Scanner(System.in);
            int score = 0;

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (String option : options[i]) {
                    System.out.println(option);
                }

                System.out.print("Ваша відповідь (введіть номер): ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == answers[i]) {
                    score++;
                }
            }

            System.out.println("Ви набрали " + score + " з " + questions.length);
            scanner.close();
        }
    }
