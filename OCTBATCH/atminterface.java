import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
     public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
class ATM {
    private BankAccount userAccount;
    private Scanner scanner;
    public ATM() {
        userAccount = new BankAccount(1000.0);
        scanner = new Scanner(System.in);
    }
    public void displayOptions() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void start() {
        int choice;
        do {
            displayOptions();
            System.out.print(" Please Enter your choice: ");
            choice = scanner.nextInt();
        switch (choice) {
             case 1:
                System.out.println("Your balance: $" + userAccount.getBalance());
                 break;
            case 2:
                System.out.print("Enter the amount to deposit: $");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: $");
                double withdrawAmount = scanner.nextDouble();
                userAccount.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Exit. Thank you");
                break;
            default:
                System.out.println("Your choice is Invalid. Try again.");
            }
        } while (choice != 4);
    }
    public void close() {
        scanner.close();
    }
}
public class atminterface {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
        atm.close();
    }
}
