package Lab10.Task5;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта WasherDryer
        WasherDryer washerDryer = new WasherDryer("Samsung");

        // Виклик методів напряму через об'єкт
        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();

        // Поліморфізм
        Appliance appliance = washerDryer;
        Washable washable = washerDryer;
        Dryable dryable = washerDryer;

        System.out.println("\nДемонстрація поліморфізму:");
        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}

