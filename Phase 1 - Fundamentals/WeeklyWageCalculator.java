import java.util.Scanner;

public class WeeklyWageCalculator{
    public static void main(String[] args){

        double hoursWorked;
        double hourlyRate;
        double afterTax = 0.8;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours worked: ");
        hoursWorked = scanner.nextDouble();

        System.out.println("Now, enter hourly rate: ");
        hourlyRate = scanner.nextDouble();

        double weeklyWage = hoursWorked * hourlyRate;
        
        scanner.close();

        System.out.printf("You worked: %.1fhrs for: %.2f. You're weekly income is: %.2f",hoursWorked, hourlyRate, weeklyWage);
        System.out.printf(" After tax: %.2f", weeklyWage * afterTax);

    }
}