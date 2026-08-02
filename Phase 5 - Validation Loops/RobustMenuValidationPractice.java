import java.util.Scanner;

public class RobustMenuValidationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = getValidOption(scanner);

        while (option != 4) {
            switch (option) {
                case 1:
                    System.out.println("Hello");
                    break;

                case 2:
                    System.out.println("5");
                    break;

                case 3:
                    System.out.println("This is option 3.");
                    break;
            
                case 4:
                    System.out.println("bye");
                    break;
            }

            option = getValidOption(scanner);
        }

        scanner.close();
    }

    public static int getValidOption (Scanner scanner) {
      int option;

        while (true) {
            System.out.println("Menu:\n1. Say hello\n2. Display a number\n3. Display a message\n4. Exit");

            System.out.println("Enter option:");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a whole number:");
                scanner.nextLine();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            if (option >= 1 && option <=4) {
                return option;
            }

            System.out.println("Option must be between 1 and 4.");
        }
    }
}
