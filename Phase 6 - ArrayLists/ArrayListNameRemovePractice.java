import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNameRemovePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean nameFound = false;

        System.out.println("Enter five names:");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("Enter a name to remove:");
        String removeName = scanner.nextLine();

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(removeName)) {
                names.remove(i);
                nameFound = true;
                System.out.println(removeName + " removed from this list.");
                break;
            }
        }

        for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }

        if (nameFound == false) {
            System.out.println("Name not found.");
        }

        scanner.close();
    }
}
