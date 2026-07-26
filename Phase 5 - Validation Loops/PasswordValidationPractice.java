import java.util.Scanner;

public class PasswordValidationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validPassword = getValidPassword(scanner);

        System.out.println("Password: " + validPassword);
    }

    public static String getValidPassword(Scanner scanner) {
        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        while (password.length() < 8){
            System.out.println("Invalid password. Must be 8 or more letters.");
            password = scanner.nextLine();
        }

        return password;
    }
}