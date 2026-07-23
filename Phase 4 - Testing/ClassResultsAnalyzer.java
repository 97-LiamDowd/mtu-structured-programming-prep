import java.util.Scanner;

public class ClassResultsAnalyzer {
    public static void main(String[] args){
        //Input: Marks of 5 students;
        /*
          Process: Take in the marks of 5 students; Store in array; Calculate the average and class results; Find the highest, and lowest marks; Count the passes and fails;
        */
        //Output: Class average, highest/lowest marks, passes/fails, class result;

        double[] classMarks = new double [5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks:");
        for (int i = 0; i < classMarks.length; i++) {
            classMarks[i] = scanner.nextDouble();
        }

        double averageMarks = calculateAverageMarks(classMarks);
        System.out.println(averageMarks); 
    }

    public static double calculateAverageMarks(double classMarks[]){
        double totalMarks = 0;

        for (int i = 0; i < classMarks.length; i++) {
            totalMarks = totalMarks + classMarks[i];
        }

        return totalMarks / classMarks.length;
    }

    

}