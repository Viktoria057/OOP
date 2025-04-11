package Lab8.Task3;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name); // Виклик конструктора Mammal → Animal
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
