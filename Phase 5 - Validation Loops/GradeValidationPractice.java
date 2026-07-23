import java.util.Scanner;

public class GradeValidationPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double grade;

        System.out.println("Enter a grade from 0 to 100:");
        grade = scanner.nextDouble();

        while ( grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Try again:");
            grade = scanner.nextDouble();
        }

        System.out.printf("Valid grade entered:%n%.1f", grade);
        scanner.close();
    }
}
