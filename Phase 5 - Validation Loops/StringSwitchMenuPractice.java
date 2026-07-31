import java.util.Scanner;

public class StringSwitchMenuPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = getValidOption(scanner);

        switch (option) {
            case "balance":
                System.out.println("Balance selected.");
                break;
            
            case "withdraw":
                System.out.println("Withdraw selected.");
                break;
            
            case "deposit":
                System.out.println("Deposit selected");
                break;
            
            case "exit":
                System.out.println("Exit selected.");
                break;

            default:
                System.out.println("Invalid.");
        }

        scanner.close();
    }

    public static String getValidOption(Scanner scanner) {
        System.out.println("Menu options:\nBalance\nWithdraw\nDeposit\nExit");
        String option = scanner.nextLine().trim().toLowerCase();

        while (!option.equalsIgnoreCase("balance") && !option.equalsIgnoreCase("withdraw") && !option.equalsIgnoreCase("deposit") && !option.equalsIgnoreCase("exit")) {
            System.out.println("Invalid option. Try again.");
            System.out.println("Menu options:\nBalance\nWithdraw\nDeposit\nExit");
            option = scanner.nextLine().trim().toLowerCase();
        }

        return option;
    }
}
