package Lab9.Task_3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Square(),
                new Triangle(),
                new Shape()
        };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
