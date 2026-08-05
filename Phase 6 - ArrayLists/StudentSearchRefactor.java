import java.util.Scanner;
import java.util.ArrayList;

public class StudentSearchRefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> marks = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            students.add(getValidName(scanner));
            marks.add(getValidMark(scanner));
        }

        String searchName = getValidSearchName(scanner); 

        if (findStudentName(students, searchName) == true) {
            System.out.println("Student: " + searchName);
        }

        scanner.close();
    }

    public static String getValidName(Scanner scanner) {
        String name;

        do {
            
            System.out.println("Enter name:");
            name = scanner.nextLine().trim().toLowerCase();

            if(!name.trim().isEmpty()) {
                return name;
            }

            System.out.println("Cannot be blank.");

        } while (true);
    }

    public static double getValidMark(Scanner scanner) {
        double mark = 0;

        do {

            System.out.println("Enter mark");

            while (!scanner.hasNextDouble()) {
                System.out.println("Must be a number.");
                scanner.nextLine();
            }

            mark = scanner.nextDouble();
            scanner.nextLine();

            if (mark >= 0 && mark <= 100) {
                return mark;
            }

            System.out.println("Invalid must be between 0 - 100.");

        } while (true);
    }

    public static void printList(ArrayList<String> students, ArrayList<Double> marks) {
        
        for (int i = 0; i < 4; i++){
            System.out.print(i + ": " + students.get(i) + " - ");
            System.out.printf("%.2f%n", marks.get(i));
        }
    }

    public static String getValidSearchName(Scanner scanner) {
        String searchName;

        do {

            System.out.println("Enter search name:");
            searchName = scanner.nextLine().trim().toLowerCase();

            if(!searchName.trim().isEmpty()) {
                return searchName;
            }

            System.out.println("Cannot be blank.");

        } while (true);
    }

    public static boolean findStudentName(ArrayList<String> students, String searchName) {
        boolean nameFound = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(searchName)) {
                nameFound = true;
                break;
            }
        }

        return nameFound;
    }
}
