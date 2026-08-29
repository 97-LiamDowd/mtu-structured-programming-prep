import java.util.Scanner;
import java.util.ArrayList;

public class NumberListAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int arraySize = getValidArraySize(scanner);

        for (int i = 0; i < arraySize; i++) {
            numbers.add(getValidNumber(scanner));
        }

        int total = calculateValidTotal(numbers);
        double average = total / arraySize;
        int highestNumber = calculateValidHighestNumber(numbers);
        int lowestNumber = calculateValidLowestNumber(numbers);

        printList(numbers);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f", average);
        System.out.println("\nHighest number: " + highestNumber + "\nLowest number: " + lowestNumber);

    }

    public static int getValidArraySize (Scanner scanner) {
        
        System.out.println("Enter the size you want the number list to be:");

        while (true) {

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input, must be a whole number:");
                scanner.nextLine();
            }

            int arraySize = scanner.nextInt();
            scanner.nextLine();

            if (arraySize >= 3 && arraySize <= 8) {
                return arraySize;
            }

            System.out.println("Invalid input, must be between 3 - 8:");
        }
    }

    public static int getValidNumber(Scanner scanner) {

        System.out.println("Enter a number:");
        while (true) {

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number, must be an whole number:");
                scanner.nextLine();
            }

            int number = scanner.nextInt();
            scanner.nextLine();

            if (number >= 0) {
                return number;
            }

            System.out.println("Invalid input, must be a positive number.");
        }
    }

    public static void printList(ArrayList<Integer> numbers) {

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static int calculateValidTotal(ArrayList<Integer> numbers) {

        int total = 0;

        for(int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }

        return total;
    }

    public static int calculateValidHighestNumber(ArrayList<Integer> numbers) {

        int highestNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (highestNumber < numbers.get(i)) {
                highestNumber = numbers.get(i);
            }
        }

        return highestNumber;
    }

    public static int calculateValidLowestNumber(ArrayList<Integer> numbers) {

        int lowestNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (lowestNumber > numbers.get(i)) {
                lowestNumber = numbers.get(i);
            }
        }

        return lowestNumber;
    }
}
