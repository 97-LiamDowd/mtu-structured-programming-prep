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

        scanner.close();

        double averageMarks = calculateAverageMarks(classMarks);
        double highestMark = findHighestMark(classMarks);
        double lowestMark = findLowestMark(classMarks);
        int pass = countPasses(classMarks);
        int fail = countFails(classMarks);
        String classResult = classResult(pass);

        System.out.printf("%nClass average: %.2f%nHighest mark: %.2f%nLowest mark %.2f%n", averageMarks, highestMark, lowestMark);
        System.out.println("Passes: " + pass + "\nFails: " + fail + "\nClass result: " + classResult);
         
    }

    public static double calculateAverageMarks(double classMarks[]){
        double totalMarks = 0;

        for (int i = 0; i < classMarks.length; i++) {
            totalMarks = totalMarks + classMarks[i];
        }

        return totalMarks / classMarks.length;
    }

    public static double findHighestMark(double classMarks[]){
        double highestMark = classMarks[0];

        for (int i = 0; i < classMarks.length; i++){

            if (highestMark < classMarks[i]) {
                highestMark = classMarks[i]; 
            }            
        }

        return highestMark;
    }

    public static double findLowestMark(double classMarks[]){
        double lowestMark = classMarks[0];

        for (int i = 0; i < classMarks.length; i++){

            if (lowestMark > classMarks[i]) {
                lowestMark = classMarks[i]; 
            }            
        }

        return lowestMark;
    }

    public static int countPasses(double classMarks[]){
        int pass = 0;

        for (int i = 0; i < classMarks.length; i++) {
            if (classMarks[i] >= 50) {
                pass = pass + 1;
            }
        }

        return pass;
    }

    public static int countFails(double classMarks[]){
        int fail = 0;

        for (int i = 0; i < classMarks.length; i++) {
            if (classMarks[i] < 50) {
                fail = fail + 1;
            }
        }

        return fail;
    }

    public static String classResult(int pass){
        String classResult;

        if (pass == 5) {
            classResult = "Exellent";
        }

        else if (pass == 4) {
            classResult = "Good";
        }

        else if (pass == 3) {
            classResult = "Satisfactory";
        }

        else{
            classResult = "Poor";
        }

        return classResult;
    }
}