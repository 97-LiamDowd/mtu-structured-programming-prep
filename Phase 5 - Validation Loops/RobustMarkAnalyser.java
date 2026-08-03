import java.util.Scanner;
import java.util.ArrayList;

public class RobustMarkAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> marks = new ArrayList<>();
        int markSize = getValidMarkSize(scanner);
        
        for ( int i = 0; i < markSize; i++) {
            System.out.println("Enter mark of student " + (i + 1) + ":");
            marks.add(getValidMark(scanner));
        }

        double average = calculateAverageMark(marks);
        double highestMark = getHighestMark(marks);
        double lowestMark = getLowestMark(marks);
        int passCounter = countPassed(marks);
        int failCounter = countfailed(marks);

        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Student " + (i + 1) + "'s mark is: " + marks.get(i));
        }

        System.out.printf("%nHighest mark: %.2f%nLowest mark: %.2f%nAverage mark: %.2f%n", highestMark, lowestMark, average);
        System.out.println("Passes: " + passCounter + "\nFails: " + failCounter);
    }

    public static int getValidMarkSize(Scanner scanner) {
        int markSize;
        
        System.out.println("How many marks are you entering:");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number. must be a whole number");
            scanner.nextLine();
        }

        markSize = scanner.nextInt();
        scanner.nextLine();

        while (markSize < 1 || markSize > 10) {
            System.out.println("Invalid number. Must be between 1 - 10:");
            markSize = scanner.nextInt();
        }

        return markSize;
    }

    public static double getValidMark(Scanner scanner) {
        double mark = 0;

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid number. must be a whole number");
            scanner.nextLine();
        }
            
        mark = scanner.nextDouble();
        scanner.nextLine();

        while (mark < 0 || mark > 100) {
            System.out.println("Invalid mark. must be between 1-100");
            mark = scanner.nextDouble();
        
        }   
    
        return mark;
    }

    public static double calculateAverageMark(ArrayList<Double> marks) {
        double total = 0;

        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
        }

        return total / marks.size();
    }

    public static double getHighestMark(ArrayList<Double> marks) {
        double highestMark = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            if (highestMark < marks.get(i)) {
                highestMark = marks.get(i);
            }
        }

        return highestMark;
    }

    public static double getLowestMark(ArrayList<Double> marks) {
        double lowestMark = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            if (lowestMark > marks.get(i)) {
                lowestMark = marks.get(i);
            }
        }

        return lowestMark;
    }

    public static int countPassed(ArrayList<Double> marks) {
        int passGrade = 40;
        int passCounter = 0;

        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) >= passGrade) {
                passCounter++;
            }
        }

        return passCounter;
    }

    public static int countfailed(ArrayList<Double> marks) {
        int passGrade = 40;
        int failCounter = 0;

        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < passGrade) {
                failCounter++;
            }
        }

        return failCounter;
    }
}
