import java.util.Scanner;
import java.util.ArrayList;

public class StudentResultsManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> marks = new ArrayList<>();
        
        int option = getValidOption(scanner);

        do {

            switch (option) {
                case 1: 
                    students.add(getValidName(students, scanner));
                    marks.add(getValidMark(marks, scanner));
                    System.out.println("Student added.");
                    break;

                case 2:
                    printStudents(students, marks);
                    break;

                case 3:
                    String searchStudent = searchStudentName(students, scanner);
                    printSearchResult(students, marks, searchStudent);
                    break;


                case 4:
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

            option = getValidOption(scanner);
            
        } while (option != 4);

        
    }

    public static void printMenu() {
        System.out.println("Menu:\n1. Add student\n2. Display students\n3. Search students\n4. Exit");
    }

    public static int getValidOption(Scanner scanner) {
        int option;

        do {
            printMenu();
            System.out.println("Enter option:");
            
            while(!scanner.hasNextInt()){
                System.out.println("Invalid option. Must be a whole number:");
                scanner.nextLine();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            if (option > 0 && option < 5) {
                return option;
            }

            System.out.println("Invalid input. Must be between 1 - 4.");
        
        } while(true);
    }

    public static String getValidName(ArrayList<String> students, Scanner scanner) {
        String name;

        do {
            System.out.println("Enter name: ");
            name = scanner.nextLine().trim().toLowerCase();

            if(!name.trim().isEmpty()){
                return name;
            }

            System.out.println("Invalid name. Cannot be left blank.");

        } while (true);
    }

    public static double getValidMark(ArrayList<Double> marks, Scanner scanner) {
        double mark;

        do {
            System.out.println("Enter mark:");

            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid mark. Must be a number.");
                scanner.nextLine();
            }

            mark = scanner.nextDouble();
            scanner.nextLine();

            if (mark >= 0 && mark <= 100) {
                return mark;
            }

            System.out.println("Invalid mark. Must be between 0 - 100.");

        } while (true);
    }

    public static void printStudents(ArrayList<String> students, ArrayList<Double> marks) {
        int pass = 40;

        if (students.isEmpty()){
            System.out.println("No students have been added.");
        }

        else{
            for (int i = 0; i < students.size(); i++) {
                System.out.print(i + ": " + students.get(i) + " - ");
                System.out.printf("%.2f - ", marks.get(i));
                if (marks.get(i) >= pass){
                    System.out.println("Pass");
                }

                else{
                    System.out.println("Fail");
                }
            
            }
        }
    }

    public static String searchStudentName(ArrayList<String> students, Scanner scanner) {
        String searchStudent;

        System.out.println("Enter name:");

        do {
            searchStudent = scanner.nextLine().trim().toLowerCase();

            if (!searchStudent.trim().isEmpty()) {
                return searchStudent;
            }

            System.out.println("Invalid name. Cannot be left blank.");

        } while (true);
    }

    public static void printSearchResult(ArrayList<String> students, ArrayList<Double> marks, String searchStudent) {
        int pass = 40;
        boolean nameFound = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == searchStudent) {
                nameFound = true;
                System.out.print(searchStudent + " was found at index " + i + ".\nMark: ");
                System.out.printf("%.2f%n", marks);
                if (marks.get(i) >= pass){
                    System.out.println("Pass");
                }

                else{
                    System.out.println("Fail");
                }
            }
        }

        if(!nameFound) {
            System.out.println(searchStudent + " was not found.");
        }

    }
}
