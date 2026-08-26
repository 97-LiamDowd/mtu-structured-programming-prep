import java.util.Scanner;

public class WeeklyWageCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double overTime = 0;
        double totalHours = 0;

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter hours worked:");
        double hoursWorked = scanner.nextDouble();
        
        //must use a formula from my head to seperate both normal hours and overtime
        while(hoursWorked < 0 || hoursWorked > 60) {
            System.out.println("Incorrected, must be below 0 and above 60:");
            hoursWorked = scanner.nextDouble();
            if (hoursWorked > 39) {
                overTime = hoursWorked - 39;
                hoursWorked = 39;
                totalHours = overTime + hoursWorked;
            }
        }

        System.out.println("Enter hourly rate:");
        double hourlyRate = scanner.nextDouble();

        double grossPay = ((overTime * 1.5) + hoursWorked) * hourlyRate;

        scanner.close();

        System.out.println("Employee name: " + name);
        System.out.printf("%nHours worked: %.2f%nHourly rate: %.2f%nGross weekly pay: %.2f", totalHours, hourlyRate, grossPay);

    }
}
