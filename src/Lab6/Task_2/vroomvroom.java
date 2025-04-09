package Lab6.Task_2;
import java.util.Scanner;

public class vroomvroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Введіть марку авто: ");
        car.mark = scanner.nextLine();
        System.out.print("Введіть модель авто: ");
        car.model = scanner.nextLine();
        System.out.print("Введіть швидкість авто: ");
        car.speed = scanner.nextInt();
        car.carInfo();
        System.out.println("На скільки прискорити ваш транспорт?");
        car.up = scanner.nextInt();
        car.speed_up();
    }
}
