package Lab6.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Стёпа";
        cat.sound = "Мяу!!!";

        Animal donkey = new Animal();
        donkey.name = "Карина";
        donkey.sound = "Иа-иа-иа!!!";

        Animal puppy = new Animal();
        puppy.name = "Боря";
        puppy.sound = "Гав-Гав!!!";

        Animal[] animals = {cat , donkey , puppy};

        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
