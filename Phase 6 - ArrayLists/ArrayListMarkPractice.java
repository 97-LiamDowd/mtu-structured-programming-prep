import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMarkPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> marks = new ArrayList<>();
        double total = 0;
        double average = 0;
        double highestMarks = marks.get(0);
        double lowestMarks = marks.get(0);

        System.out.println("Enter five grades:");

        for (int i = 0; i < 5; i++) {
            double mark = scanner.nextDouble();
            marks.add(mark);
        }

        for (int i = 0; i < marks.size(); i++) {
            total = total + marks.get(i);
            average = total / marks.size();
        }

        for (int i = 0; i < marks.size(); i++) {

            if(highestMarks < marks.get(i)) {
                highestMarks = marks.get(i);
            }

            if(lowestMarks > marks.get(i)) {
                lowestMarks = marks.get(i);
            }
        }

        System.out.printf("Average mark: %.2f%nHighest mark: %.2f%nLowest mark: %.2f", average, highestMarks, lowestMarks);

        scanner.close();
    }
}
