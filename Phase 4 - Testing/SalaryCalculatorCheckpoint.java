import java.util.Scanner;

public class SalaryCalculatorCheckpoint {
    public static void main(String[] args){
        //inputs: employee name, hourly rate, hours worked, tax amount, gross pay, net pay, tax rate
        /*
        Process: take inputs for employee name, hourly rate, and hours worked
        store inputs into variables. Create methods for calculating gross pay, tax amount
        and net pay.
         */
        //outputs: tax amount, gross pay, net pay, employee name, tax rate.

        String employeeName;
        double hourlyRate = 0;
        double hoursWorked = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Name:");
        employeeName = scanner.nextLine();

        System.out.println("Enter Hourly-Rate:");
        hourlyRate = scanner.nextDouble();

        System.out.println("Enter Hours Worked:");
        hoursWorked = scanner.nextDouble();

        scanner.close();

        double grossPay = calculateGrossPay(hoursWorked, hourlyRate);
        double taxAmount = calculateTaxAmount(grossPay);
        double netPay = calculateNetPay(taxAmount, grossPay);

        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Gross Pay: %.2f%nTax Amount: %.2f%nNet Pay: %.2f", grossPay, taxAmount, netPay);
    }

    public static double calculateGrossPay (double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;        
    }

    public static double calculateTaxAmount (double grossPay) {
        if (grossPay <= 500) {
            return grossPay * 0.1;
        }
        else{
            return grossPay * 0.2;
        }
    }

    public static double calculateNetPay (double taxAmount, double grossPay) {
        return grossPay - taxAmount;
    }

}