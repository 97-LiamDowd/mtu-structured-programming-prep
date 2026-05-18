import java.util.Scanner;

public class StudentGradeSystemV2 {
    public static void main(String[] args){

        //variables
        String studentName;
        double grade;
        double averageGrade;
        double runningTotal = 0;
        Scanner scanner = new Scanner(System.in);

        //inputs
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();
        
        for(int i = 0; i < 5; i++){

            System.out.print("Enter grade " + (i + 1) + ": ");
            grade = scanner.nextDouble();
            runningTotal = runningTotal + grade;
        }
            
        scanner.close();

        System.out.println("Student: " + studentName);

        //creating average grade
        averageGrade = runningTotal/5;
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