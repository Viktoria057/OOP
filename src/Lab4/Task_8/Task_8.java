package Lab4.Task_8;

public class Task_8 {
    static int counter = 0;

    static void increment() {
        counter += 1;
    }

    static void setCounter(int counter) {
        System.out.println("Passed value: " + counter);
    }

    public static void main(String[] args) {
        System.out.println("The value of counter to setCounter: " + counter);

        setCounter(15);

        System.out.println("The value of counter after setCounter: " + counter);
    }
}
