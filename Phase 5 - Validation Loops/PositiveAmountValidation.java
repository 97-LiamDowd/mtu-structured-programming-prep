import java.util.Scanner;

public class PositiveAmountValidation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;

        System.out.println("Enter wthdrawal amount:");
        amount = scanner.nextInt();

        while (amount <= 0) {
            System.out.println("Invalid amount. Enter an amount greater than 0:");
            amount = scanner.nextInt();
        }

        System.out.println ("Valid withdrawal amount: " + amount);

        scanner.close();
    }
}