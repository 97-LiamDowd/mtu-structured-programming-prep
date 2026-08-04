import java.util.Scanner;

public class TempatureConverter {
    public static void main(String[] args) {
        //Inputs
        //declaring variables
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        //take user input for celsius
        System.out.println("Enter Celsius tempatrure:");
        celsius = scanner.nextDouble();

        //Process
        //calculate fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        //Output
        //printing
        System.out.printf("The celsius: %.2f%nThe Fahrenheit: %.2f", celsius, fahrenheit);

        scanner.close();
    }
}
