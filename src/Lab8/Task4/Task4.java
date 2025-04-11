package Lab8.Task4;

public class Task4 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Площа круга: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());
    }
}

