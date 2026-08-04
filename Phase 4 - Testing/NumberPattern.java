import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        //Input
        //Declaring variables
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        //take user input, store in numbers.
        System.out.println("Enter a positive integer:");
        number = scanner.nextInt();

        //Process
        //create loop for printing
        for (int i = 1; i <= number; i++) {
            //output
            //print numbers
            System.out.println(i);
        }

        System.out.println("Finished");

        scanner.close();
    }
}
