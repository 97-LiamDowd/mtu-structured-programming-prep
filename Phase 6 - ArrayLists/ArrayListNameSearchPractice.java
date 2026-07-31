import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNameSearchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int counter = 0;
        boolean nameFound = false;

        System.out.println("Enter 5 names:");
        
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("Enter a name to search for:");
        String searchName = scanner.nextLine();

        for (int i = 0; i < names.size(); i++) {
            counter = i;

            if (names.get(i).equalsIgnoreCase(searchName)) {
                System.out.println("Name found. Located at index: " + counter); 
                nameFound = true;   
            }
        }

        if(nameFound == false){
            System.out.println("Name not found.");
        }

        scanner.close();
    }
}
