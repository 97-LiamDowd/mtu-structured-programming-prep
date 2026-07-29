import java.util.Scanner;

public class stringMenuATMPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = getValidOption(scanner);
        double balance = 500;
        
        while (!option.equals("exit")){

            if (option.equals("balance")) {
                System.out.printf("Balance: %.2f%n", balance);
            }

            else if (option.equals("withdraw")) {
                double withdraw = getValidWithdraw(balance, scanner);
                balance = balance - withdraw;
            }

            else if (option.equals("deposit")) {
                double deposit = getValidDeposit(scanner);
                balance = balance + deposit;
            }

            option = getValidOption(scanner);
        }

        System.out.println("Thank you for using this ATM.");
        scanner.close();

    }


    public static String getValidOption(Scanner scanner) {
        System.out.println("Enter option:\n1. Balance\n2. Withdraw\n3. Deposit\n4. Exit");
        String option = scanner.nextLine();
        option = option.trim().toLowerCase();

        while (!option.equalsIgnoreCase("balance") && !option.equalsIgnoreCase("withdraw") && !option.equalsIgnoreCase("deposit") && !option.equalsIgnoreCase("exit")) {
            System.out.println("Invalid option. Must be balance, withdraw, deposit, or exit:");
            option = scanner.nextLine();
            option = option.trim().toLowerCase();
        }

        return option;
    }

    public static double getValidWithdraw(double balance, Scanner scanner) {
        System.out.println("Enter amount:");
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
