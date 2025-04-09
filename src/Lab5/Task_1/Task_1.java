package Lab5.Task_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double principal, monthlyDeposit, annualRate;
        int years, timesCompounded;


        System.out.print("Enter the initial principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the monthly deposit: ");
        monthlyDeposit = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
        annualRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = scanner.nextInt();


        double r = annualRate / 100;


        double amount = principal * Math.pow(1 + r / timesCompounded, timesCompounded * years);


        for (int i = 0; i < years * 12; i++) {
            amount += monthlyDeposit * Math.pow(1 + r / timesCompounded, timesCompounded * (years - (double)i / 12));
        }

        System.out.printf("The amount after %d years is: $%.2f\n", years, amount);


        scanner.close();
    }
}

