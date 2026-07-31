import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListNamePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter five name:");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name); 
        }

        System.out.println("Names entered:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        scanner.close();
    }
}
