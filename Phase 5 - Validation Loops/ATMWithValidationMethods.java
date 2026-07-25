import java.util.Scanner;

public class ATMWithValidationMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 500;
        int option = 0;

        while (option != 4) {
            System.out.println("1. Check balance\n2. Withdraw\n3. Deposit\n4. Exit");
            option = scanner.nextInt();
            option = menuValidation(option, scanner);

            if (option == 1) {
                System.out.printf("Balance: %.2f%n", balance);            
            }

            else if (option == 2) {
                balance = withdrawalValidation(balance, scanner);
                System.out.printf("Balance: %.2f%n", balance);  
            }

            else if (option == 3) {
                balance = depositValidation(balance, scanner);
                System.out.printf("Balance: %.2f%n", balance);  
            }

            else if (option == 4) {
                System.out.println("Thank you for using ATM.");
            }
        }

        scanner.close();

    }

    public static int menuValidation(int option, Scanner scanner) {
        while (option < 1 || option > 4) {
            System.out.println("Invalid option. Selected between option 1 - 4:");
            option = scanner.nextInt();
        }

        return option;
    }

    public static double withdrawalValidation (double balance, Scanner scanner) {
        System.out.println("Amount:");
        double amount = scanner.nextDouble();

        while (amount <= 0 || amount > balance) {
            if (amount <= 0) {
                System.out.println("Invalid, must be above 0:");
                amount = scanner.nextDouble();
            }

            else if (amount > balance) {
                System.out.println("Insufficent funds. Try again:");
                amount = scanner.nextDouble();
            } 
        }

        return balance = balance - amount;
    }

    public static double depositValidation (double balance, Scanner scanner) {
        System.out.println("Amount:");
        double amount = scanner.nextDouble();

        while (amount <= 0) {
            System.out.println("Invalid, must be above 0:");
            amount = scanner.nextDouble();
        }

        return balance = balance + amount;
    }
}
