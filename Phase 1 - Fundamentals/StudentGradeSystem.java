import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args){

        //variables
        String studentName;
        double gradeOne;
        double gradeTwo;
        double gradeThree;
        double averageGrade;
        Scanner scanner = new Scanner(System.in);

        //inputs
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter first grade: ");
        gradeOne = scanner.nextDouble();

        System.out.print("Enter second grade: ");
        gradeTwo = scanner.nextDouble();
        
        System.out.print("Enter third grade: ");
        gradeThree = scanner.nextDouble();

        scanner.close();

        System.out.println("Student: " + studentName);

        //process
        //creating average grade
        averageGrade = (gradeOne + gradeTwo + gradeThree)/3;
        System.out.printf("Grade average: %.2f\n", averageGrade);

        //creating grade
        if(averageGrade < 100 && averageGrade >= 85){
            System.out.print("Grade: Distinction");
        }

        else if(averageGrade < 85 && averageGrade >= 70){
            System.out.println("Grade: Merit");
        }

        else if(averageGrade < 70 && averageGrade >= 50){
            System.out.println("Grade: Pass");
        }

        else{
            System.out.println("Grade: Fail");
        }

    }
}
