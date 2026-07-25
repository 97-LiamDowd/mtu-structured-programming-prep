import java.util.Scanner;

public class YesNoValidationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = getValideYesNo(scanner);
        System.out.println(answer);
        scanner.close();
    }

    public static String getValideYesNo(Scanner scanner) {
        System.out.println("Do you want to continue? yes/no");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
            System.out.println("Invalid answer. Must be yes/no:");
            answer = scanner.nextLine();
        }

        return answer;
    }
}
