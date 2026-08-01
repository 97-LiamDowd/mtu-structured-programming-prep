import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNameManager {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int option = getValidOption(scanner);

        while (option != 6) {
            switch (option) {
                case 1:
                    names.add(addName(names, scanner));
                    break;
            
                case 2:
                    printNames(names);
                    break;

                case 3:
                    getSearchName(names, scanner);
                    break;
                    
                case 4:
                    updateName(names, scanner);
                    break;

                case 5:
                    removeName(names, scanner);
                    break;

                default:
                    System.out.println("Invalid Option.");
                    break;
            }

            option = getValidOption(scanner);
        }

        System.out.println("Thanks for using this program.");
        scanner.close();
    }

    public static int getValidOption(Scanner scanner) {
        System.out.println("Menu:\n1. Add name\n2. Display names\n3. Search for name\n4. Update name\n5. Remove name\n6. Exit");
        int option = scanner.nextInt();

        while (option <= 0 || option > 6) {
            System.out.println("Invalid option. Try again.");
            System.out.println("Menu:\n1. Add name\n2. Display names\n3. Search for name\n4. Update name\n5. Remove name\n6. Exit");
            option = scanner.nextInt();
        }
        scanner.nextLine();
        return option;
    }

    public static String addName(ArrayList<String> names, Scanner scanner) {
        System.out.println("Enter name:");
        String name = scanner.nextLine().trim().toLowerCase();

        while (name.trim().isEmpty()) {
            System.out.println("Invalid name. Try again, cannot be blank:");
            name = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println(name + " was added");
        return name;
    }

    public static void printNames(ArrayList<String> names) {
        if (names.isEmpty()) {
            System.out.println("The list is empty.");
        }
        
        else {
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }
        }
    }

    public static void getSearchName(ArrayList<String> names, Scanner scanner) {
        System.out.println("Enter a name to search:");
        String searchName = scanner.nextLine().trim().toLowerCase();
        boolean foundName = false;

        while (searchName.trim().isEmpty()) {
            System.out.println("Invalid name. Cannot be blank:");
            searchName = scanner.nextLine().trim().toLowerCase();
        }

        for (int i = 0; i < names.size(); i++) {
            
            if (searchName.equals(names.get(i))) {
                foundName = true;
                System.out.println("Name found at index " + i);
            }
        }

        if (foundName == false) {
            System.out.println("Name not found.");
        }
    }

    public static void updateName(ArrayList<String> names, Scanner scanner) {
        System.out.println("Enter a name to update:");
        String updateName = scanner.nextLine().trim().toLowerCase();
        boolean foundName = false;

        while (updateName.trim().isEmpty()) {
            System.out.println("Invalid name. Cannot be blank:");
            updateName = scanner.nextLine().trim().toLowerCase();
        }

        for (int i = 0; i < names.size(); i++) {
            
            if (updateName.equals(names.get(i))) {
                foundName = true;
                System.out.println(updateName + " was found at " + i + ".\nWould you like to replace this name:");
                String replaceName = scanner.nextLine().trim().toLowerCase();

                while (!replaceName.equals("yes") && !replaceName.equals("no")) {
                    System.out.println("Invalid input. must be yes or no.");
                    replaceName = scanner.nextLine().trim().toLowerCase();
                }

                switch (replaceName) {
                    case "yes":
                        System.out.println("Enter a new name:");
                        String newName = scanner.nextLine().trim().toLowerCase();

                        while (newName.isEmpty()) {
                            System.out.println("Invalid name. Try again:");
                            newName = scanner.nextLine().trim().toLowerCase();
                        }

                        names.set(i, newName);
                        break;
                
                    case "no":
                        System.out.println("Name was not found.");
                        break;

                    default:
                        System.out.println("Invalid answer.");
                        break;
                }

                break;
            }
        }

        if (foundName == false) {
            System.out.println("Name not found.");
        }
    }

    public static void removeName (ArrayList<String> names, Scanner scanner) {
        System.out.println("Enter a name to remove:");
        String removeName = scanner.nextLine().trim().toLowerCase();
        boolean foundName = false;

        while (removeName.trim().isEmpty()) {
            System.out.println("Invalid name. Cannot be blank:");
            removeName = scanner.nextLine().trim().toLowerCase();
        }

        for (int i = 0; i < names.size(); i++) {
            if (removeName.equals(names.get(i))) {
                foundName = true;
                names.remove(i);
                break;
            }
        }

        if (foundName == false) {
            System.out.println("Name not found.");
        }
    }
}
