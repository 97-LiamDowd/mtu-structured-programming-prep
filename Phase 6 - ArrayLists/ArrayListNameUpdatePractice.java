import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNameUpdatePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean nameFound = false;

        System.out.println("Enter five names:");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("Enter a name you want to update:");
        String updateName = scanner.nextLine();

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(updateName)) {
                System.out.println("Enter a new name:");
                String newName = scanner.nextLine();
                names.set(i, newName);
                nameFound = true;
                break;
            }
        }

        if (nameFound == true) {
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }
        }

        else {
            System.out.println(updateName + " was not found in the list.");
        }

        scanner.close();
    }
}
