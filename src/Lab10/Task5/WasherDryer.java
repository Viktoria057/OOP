package Lab10.Task5;

class WasherDryer extends Appliance implements Washable, Dryable {
    public WasherDryer(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Пральна машина " + brand + " увімкнена");
    }

    @Override
    public void wash() {
        System.out.println("Прання запущено...");
    }

    @Override
    public void dry() {
        System.out.println("Сушіння запущено...");
    }
}