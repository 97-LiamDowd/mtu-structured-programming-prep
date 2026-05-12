import java.util.Scanner;

public class AverageOfThreeNumbers{
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Enter a second number: ");
        double numberTwo = scanner.nextDouble();

        System.out.print("Enter a third number: ");
        double numberThree = scanner.nextDouble();

        double average = ( numberOne + numberTwo + numberThree )/3;

        System.out.printf("The average of the numbers you have choosen is: %.2f", average);
    }
}