import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){

        int studentMarks;
        int maxMarks = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks out of " + maxMarks);
        studentMarks = scanner.nextInt();

        System.out.print("You got " + studentMarks + "%.");

        scanner.close();

        if (studentMarks >= 85) {
            System.out.print(" Grade: Distiction");
        }

            else if (studentMarks > 75 && studentMarks < 85) {
                System.out.print(" Grade: Merit");
            }

            else if (studentMarks > 50 && studentMarks < 75) {
                System.out.print(" Grade: Pass");
            }

            else{
                System.out.print(" Grade: Fail");
            }
        


    }
}
