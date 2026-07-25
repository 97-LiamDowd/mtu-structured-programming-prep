import java.util.Scanner;

public class NameValidationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getValidName(scanner);

        System.out.println("Hello, " + name);
        scanner.close();
    }

    public static String getValidName(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        while (name.trim().isEmpty()) {
            System.out.println("Invalid name, try again:");
            name = scanner.nextLine();
        }
        
        return name;
    }
}
