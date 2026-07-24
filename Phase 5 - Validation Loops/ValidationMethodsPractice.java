import java.util.Scanner;

public class ValidationMethodsPractice {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double grade = getValidGrade(scanner);
    int option = getValidMenuOption(scanner);
    double withdrawal = getValidWithdrawalAmount(scanner);

    System.out.printf("Valid grade: %.2f%n", grade);
    System.out.println("Valid option: " + option);
    System.out.printf("Valid withdrawal: %.2f", withdrawal);
    scanner.close();

    }

    public static double getValidGrade(Scanner scanner) {
        System.out.println("Enter a grade:");
        double grade = scanner.nextDouble();
        
        while (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Grade can only be between 1-100:");
            grade = scanner.nextDouble();
        }

        return grade;
    }

    public static int getValidMenuOption(Scanner scanner) {
        System.out.println("1. Check deposit\n2. Withdraw\n3. Deposit\n4. Exit");
        int option = scanner.nextInt();

        while (option < 1 || option > 4) {
            System.out.println("Invalid option. Choose between 1 - 4:");
            option = scanner.nextInt();
        }

        return option;
    }

    public static double getValidWithdrawalAmount (Scanner scanner) {
        double balance = 500;
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();

        while (amount < 1 || amount > balance) {
            System.out.println("Invalid withdrawal. Enter a number greater than 0 and less than your balance:");
            amount = scanner.nextDouble();
        }
        
        return amount;
    }
}
