import java.util.Scanner;

public class WithdrawalValidationPractice {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        double balance = 500;

        System.out.println("Enter withdrawal amount:");
        amount = scanner.nextDouble();

        while (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount. Enter a value greater than 0 and no more than your balance:");
            amount = scanner.nextDouble();
        }
        scanner.close();

        balance = balance - amount;

        System.out.println("Withdrawal accepted.\nNew balance: " + balance);
    }
}
