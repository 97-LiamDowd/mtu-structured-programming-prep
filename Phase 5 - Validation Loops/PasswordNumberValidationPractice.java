import java.util.Scanner;

public class PasswordNumberValidationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = getValidPassword(scanner);
     
        System.out.println("Password correct");
    }

    public static String getValidPassword(Scanner scanner) {
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        while (password.length() < 8 || !containsNumber(password)) {
            System.out.println("Invalid password. Must have at least 8 characters and 1 digit:");
            password = scanner.nextLine();
        }

        return password;
    }

    public static boolean containsNumber(String password) {
        boolean hasNumber = false;
        
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                hasNumber = true;
            }
        }

        return hasNumber;
    }
}
