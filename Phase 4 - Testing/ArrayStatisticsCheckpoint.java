import java.util.Scanner;

public class ArrayStatisticsCheckpoint {
    public static void main(String[] args){

        //input: fiveNumber[5], scanner;
        //process: take five input, store in array. process them into total, average, highest and lowest, print it user;
        //output: total, average, highest, lowest;

        int[] fiveNumbers = new int[5];
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five whole numbers");

        for (int i = 0; i < fiveNumbers.length; i++) {
            fiveNumbers[i] = scanner.nextInt();
            total = total + fiveNumbers[i];
        }

        scanner.close ();
        double average = total/fiveNumbers.length;
        int highest = fiveNumbers[0];
        int lowest = fiveNumbers[0];

        for (int i = 0; i < fiveNumbers.length; i++) {
            if (highest < fiveNumbers[i]) {
                highest = fiveNumbers[i];
            }

            if (lowest > fiveNumbers[i]) {
                lowest = fiveNumbers[i];
            }
        }

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Highest: " + highest + "\nLowest: " + lowest);
    }
}
