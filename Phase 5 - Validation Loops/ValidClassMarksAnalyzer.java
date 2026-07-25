import java.util.Scanner;

public class ValidClassMarksAnalyzer {
    public static void main(String[] args) {
        double[] marks = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            marks [i] = getValidMarks(scanner, i + 1);
        }

        double average = calculateAverage(marks); 
        double highestMark = findHighest(marks);
        double lowestMark = findLowest(marks);
        int countPasses = countPasses(marks);
        int countFails = countFails(marks);
        String result = getClassResult(average);

        System.out.printf("Average marks: %.2f%nHighest marks: %.2f%nLowest marks: %.2f%n", average, highestMark, lowestMark);
        System.out.println("Passes: " + countPasses + "\nFails: " + countFails + "\nClass results: " + result);
    }

    public static double getValidMarks(Scanner scanner, int studentNumber) {
        System.out.println("Enter marks for student " + studentNumber + ":");
        double marks = scanner.nextDouble();

        while (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Must be between 0 - 100:");
            marks = scanner.nextDouble();
        }

        return marks;
    }

    public static double calculateAverage (double[] marks) {
        double average = 0;
        for (int i = 0; i < marks.length; i++) {
            average = average + marks[i];
        }

        return average/marks.length;
    }

    public static double findHighest(double[] marks) {
        double highestMark = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (highestMark < marks[i]) {
                highestMark = marks[i];
            }
        }

        return highestMark;
    }

   public static double findLowest(double[] marks) {
        double lowestMark = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (lowestMark > marks[i]) {
                lowestMark = marks[i];
            }
        }

        return lowestMark;
    }

    public static int countPasses(double[] marks) {
        int passScore = 50;
        int countPasses = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= passScore) {
                countPasses = countPasses + 1;
            }
        }

        return countPasses;
    }

    public static int countFails(double[] marks) {
        int passScore = 50;
        int countFails = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < passScore) {
                countFails = countFails + 1;
            }
        }

        return countFails;
    }

    public static String getClassResult(double average) {
        String result = "";

        if (average >= 85) {
            result = "Excellent";
        }

        else if (average < 85 && average >= 70) {
            result = "Good";
        }

        else if (average < 70 && average >= 50) {
            result = "Satisfactory";
        }

        else if (average < 50) {
            result = "Poor";
        }

        return result;
    }
}