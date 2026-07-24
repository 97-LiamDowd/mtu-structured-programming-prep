import java.util.Scanner;

public class ValidatedATMSimulator {
    public static void main (String[] args) {
        int option = 0;
        double balance = 500;
        Scanner scanner = new Scanner(System.in);

        while (option != 4) {
        System.out.println("1. Check balance\n2. Withdraw\n3. Deposit\n4. Exit");
        option = scanner.nextInt();

            while (option <= 0 || option > 4) {
                System.out.println("Invalid option");
                System.out.println("1. Check balance\n2. Withdraw\n3. Deposit\n4. Exit");
                option = scanner.nextInt();
            }
        
            if (option == 1) {
                System.out.println("Blanace: " + balance);
            }

            else if (option == 2) {
                System.out.println("Withrawal option.");
            }

            else if (option == 3) {
                System.out.println("Deposit option.");
            }

            else if (option == 4) {
                System.out.println("Thank you for using the ATM.");
            }
        }

        scanner.close();
    }
}
