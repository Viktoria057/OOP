package Lab8.Task1;

public class Task1 {
    public static void main(String[]args) {
       Employee emp = new Employee ("Вікторія",18,50000.0);

       System.out.println("Ім'я: " + emp.getName());
       System.out.println("Вік: " + emp.getAge());
        System.out.println("Зарплата: " + emp.getSalary());
    }
}
