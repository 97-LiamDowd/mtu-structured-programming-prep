import java.util.Scanner;

public class SwitchATMPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 500;
        
        String option = getValidOption(scanner); 
        
        while (!option.equals("exit")) {   
            switch (option) {
                case "balance":
                    System.out.printf("Balance: %.2f%n", balance); 
                    break;

                case "withdraw":
                    double withdraw = getValidWithdraw(balance, scanner);
                    balance = balance - withdraw;
                    
                    break;

                case "deposit":
                    double deposit = getValidDeposit(scanner);
                    balance = balance + deposit;
                    
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            option = getValidOption(scanner); 
        }

        scanner.close();
    }

    public static String getValidOption(Scanner scanner) {
        System.out.println("Menu options:\nBalance\nWithdraw\nDeposit\nExit");
        String option = scanner.nextLine().trim().toLowerCase();

        while (!option.equals("balance") && !option.equals("withdraw") && !option.equals("deposit") && !option.equals("exit")) {
            System.out.println("Invalid option. Try again.");
            System.out.println("Menu options:\nBalance\nWithdraw\nDeposit\nExit");
            option = scanner.nextLine().trim().toLowerCase();
        }

        return option;
    }

    public static double getValidWithdraw(double balance, Scanner scanner) {
        System.out.println("Enter amount");
        double amount = scanner.nextDouble();

        while (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount. Must be above 0 and below balance:");
            amount = scanner.nextDouble();
        }

        scanner.nextLine();
        return amount;
    }

    public static double getValidDeposit(Scanner scanner) {
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        
        while (amount <= 0) {
            System.out.println("Invalid amount. Must be above 0:");
            amount = scanner.nextDouble();
        }

        scanner.nextLine();
        return amount;
    }
}