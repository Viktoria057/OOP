package Lab6.Task_2;

public class Car {
    public String mark;
    public String model;
    public int speed;
    public int up;

    public void carInfo() {
        System.out.println("Марка авто: " + mark + "\nМодель авто: " + model + "\nШвидкість авто: " + speed);
    }

    public void speed_up() {
        speed += up;
        System.out.println("Нова швидкість: " + speed);
    }
}
