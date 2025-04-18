package Lab9.Task_4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Shape()
        };

        for (Shape shape : shapes) {
            System.out.println("Площа: " + shape.area());
        }
    }
}
