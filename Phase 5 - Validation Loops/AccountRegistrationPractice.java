import java.util.Scanner;

public class AccountRegistrationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getValidName(scanner);
        String email = getValidEmail(scanner);
        String password = getValidPassword(scanner);

        System.out.println("Your account has been \nName: " + name + "\nEmail: " + email + "\nPassword Accepted.");
        String confirmation = getValidYesNo(scanner);

        if (confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Account created for " + name + " using email " + email + ".");
        }
        
        else {
            System.out.println("Account creation cancelled.");
        }

        scanner.close();
    }

    public static String getValidName(Scanner scanner) {
        System.out.println("Name:");
        String name = scanner.nextLine();

        while (name.trim().isEmpty()) {
            System.out.println("Invalid name. Name cannot be blank:");
            name = scanner.nextLine();
        }

        return name;
    }

    public static String getValidEmail(Scanner scanner) {
        System.out.println("Email:");
        String email = scanner.nextLine();

        while (email.trim().isEmpty() || !email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid Email. Example - Liam@gmail.com:");
            email = scanner.nextLine();
        }

        return email;
    }

    public static String getValidPassword(Scanner scanner) {
        System.out.println("Password:");
        String password = scanner.nextLine();

        while (password.length() < 8 || !containsNumber(password)) {
            System.out.println("Invalid password. Must be at least 8 characters and contain at least 1 number:");
            password = scanner.nextLine();
        }

        return password;
    }

    public static boolean containsNumber(String password) {
        boolean numberFound = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberFound = true;
            }
        }

        return numberFound;
    }

    public static String getValidYesNo(Scanner scanner) {
        System.out.println("Is this information Correct? Yes/No");
        String confirmation = scanner.nextLine();

        while (!confirmation.equalsIgnoreCase("yes") && !confirmation.equalsIgnoreCase("no")) {
            System.out.println("Invalid input. Must be yes or no:");
            confirmation = scanner.nextLine();
        }

        return confirmation;
    }
}