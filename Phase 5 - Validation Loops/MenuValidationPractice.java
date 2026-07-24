import java.util.Scanner;

public class MenuValidationPractice {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int inputOption;

        System.out.println("Choose an option:\n1. Balance\n2. Withdraw\n3. Deposit\n4. Exit");
        inputOption = scanner.nextInt();

        while (inputOption < 1 || inputOption > 4) {
            System.out.println("Invalid option, Choose 1-4:");
            inputOption = scanner.nextInt();
        }

        System.out.println("You selected option " + inputOption + ".");

        scanner.close();

    }
}
