package Lab6.Task_5;

public class Task_5 {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", "Кеті Сьєрра , Берт Бейтс");
        Book book1 = new Book("Джава для всіх!!!");

        System.out.println();
        book.getInfo();
        System.out.println();
        book1.getInfo();
    }
}
