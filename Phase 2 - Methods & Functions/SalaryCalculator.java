import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){

        String employeeName;
        double hoursWorked = 0;
        double hourlyWage = 14.70;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee's name?");
        employeeName = scanner.nextLine();

        System.out.println("Employee's hours worked?");
        hoursWorked = scanner.nextDouble();

        scanner.close();

        double grossPay = calculateGrossPay(hoursWorked, hourlyWage);
        double taxAmount = calculateTax(grossPay);
        double netPay = calculateNetPay(grossPay, taxAmount);

        System.out.println("Employee : " + employeeName);
        System.out.printf("Gross Pay : %.2f%nTax: %.2f%nNet Pay: %.2f", grossPay, taxAmount, netPay);
    }

    public static double calculateGrossPay(double hoursWorked, double hourlyWage){

        double grossPay = hoursWorked * hourlyWage;
        return grossPay;
    }

    public static double calculateTax(double grossPay){

        double taxAmount = 0;

        if(grossPay <= 500){
            taxAmount = grossPay * 0.1;
            
        }

        else{
            taxAmount = grossPay * 0.2;
            
        }

        return taxAmount;
    }

    public static double calculateNetPay(double grossPay, double taxAmount){

        double netPay = grossPay - taxAmount;
        return netPay;
    }
}