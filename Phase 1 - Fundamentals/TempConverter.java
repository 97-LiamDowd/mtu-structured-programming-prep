import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        
        double celsius;
        double fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a tempature in Celsius:");
        celsius = scanner.nextDouble();

        scanner.close();

        fahrenheit = (celsius * 9) / 5 + 32;

        System.out.printf("In Fahrenheit, that would be: %.2f" , fahrenheit);
    }
}
