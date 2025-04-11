package Lab8.Task2;

public class Vehicle {
    protected int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public void showSpeed() {
        System.out.println("Поточна швидкість: " + speed + " км/год");
    }
}
