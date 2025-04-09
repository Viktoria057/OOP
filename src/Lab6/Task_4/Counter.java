package Lab6.Task_4;

public class Counter {
    public static int counter;

    public static void increment(int increment) {
        counter += increment;
    }

    public static void getCount() {
        System.out.println("Ваше число після додавання: " + counter);
    }
}
