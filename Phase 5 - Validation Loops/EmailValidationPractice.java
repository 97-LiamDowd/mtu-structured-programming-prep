import java.util.Scanner;

public class EmailValidationPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email = getValidEmail(scanner);

        System.out.println("Email accepted:" + email);
        scanner.close();
    }

    public static String getValidEmail(Scanner scanner){
        System.out.println("Enter your Email:");
        String email = scanner.nextLine();

        while(email.trim().isEmpty() || !email.contains("@") || !email.contains(".")){
            System.out.println("Invalid Email. Example: example@gmail.com.");
            email = scanner.nextLine();
        }

        return email;
    }
}
