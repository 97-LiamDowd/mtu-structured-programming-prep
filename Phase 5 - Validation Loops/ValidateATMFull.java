import java.util.Scanner;

public class ValidateATMFull {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 500;
        int option = 0;

        while (option != 4) {
            double amount = 0;

            System.out.println("1. Check balance\n2. Withdraw\n3. Deposit\n4. Exit");
            option = scanner.nextInt();

            while (option <= 0 || option > 4) {
                System.out.println("Invalid option. Choose between 1-4:");
                System.out.println("1. Check balance\n2. Withdraw\n3. Deposit\n4. Exit");
                option = scanner.nextInt();
            }
            
            if (option == 1) {
                System.out.printf("Balance: %.2f%n", balance);
            }

            else if ( option == 2){
                while (amount <= 0 || amount > balance){
                    System.out.println("Enter amount:");
                    amount = scanner.nextDouble();
                    
                    if (amount <= 0) {
                        System.out.println("Invalid amount, must be above 0:");
                    }

                    else if (amount > balance) {
                        System.out.printf("Insufficent funds. Current balance: %.2f%n", balance);
                    }
                }

                balance = balance - amount;
                System.out.printf("%nNew balance: %.2f%n", balance);
            }

            else if ( option == 3){
                while (amount <= 0) {
                    System.out.println("Enter amount:");
                    amount = scanner.nextDouble();

                    if (amount <= 0){
                        System.out.println("Invlaid amount, must be above 0:");
                    }
                }

                balance = balance + amount;
                System.out.printf("%nNew balance: %.2f%n", balance);
            }

            else if ( option == 4){
                System.out.println("Thank you for using this ATM.");
            }

        }

        scanner.close();

    }
}
