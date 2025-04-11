package Lab8.Task2;

public class Task2 {
    public static void main(String[] args){
        Car myCar = new Car ();

        myCar.showSpeed(); // 0
        myCar.accelerate(); //+10
        myCar.accelerate(); //+10
        myCar.showSpeed(); // 20

    }
}
