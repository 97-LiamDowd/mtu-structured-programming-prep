import java.util.Scanner;

public class GradeCalculatorTest {
    public static void main(String[] args){
        //Input: student name, assignment 1 marks, assighnemt 2 marks, assignment 3 marks
        //Process: calculate the average and classify grade
        //Output: students name, average mark, result category

        String studentName, resultCategory;
        double assignemntOne, assignemntTwo, assignemntThree, averageMark;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        studentName = scanner.nextLine();

        System.out.println("Please enter your marks for assignment one:");
        assignemntOne = scanner.nextDouble();

        System.out.println("Please enter your marks for assignment three:");
        assignemntTwo = scanner.nextDouble();

        System.out.println("Please enter your marks for assignment three:");
        assignemntThree = scanner.nextDouble();

        scanner.close();

        averageMark = (assignemntOne + assignemntTwo + assignemntThree)/3;

        if(averageMark >= 85){
            resultCategory = "distinction";
        }

        else if(averageMark >= 70){
            resultCategory = "Merit";
        }

        else if(averageMark >= 50){
            resultCategory = "Pass";
        }

        else{
            resultCategory = "fail"; 

        
        System.out.println("Name: " + studentName);
        System.out.printf("Marks: %.2f%n", averageMark);
        System.out.println("Grade: " + resultCategory);
        }
    }
}
