package Lab7.Task_1;

public class Account {
    private int accountNumber;
    private double balance;

    //конструктор, що приймає номер рахунку та початковий баланс
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(int accountNumber) {
        this(accountNumber, 0);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //гетери для отримання балансу та сетери (з перевіркою) для зміни балансу
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Баланс повинен бути додатнім!!!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Ваш баланс після поповнення рахунку:" + balance);
        } else {
            System.out.println("Сума депозиту повинна бути додатньою!!!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Ваш баланс після зняття:" + balance);
        } else {
            System.out.println("Недостатньо коштів на рахунку");
        }
    }
}
