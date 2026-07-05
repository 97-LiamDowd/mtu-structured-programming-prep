import java.util.Scanner;

public class LoanRepaymentCalculator {
    public static void main(String[] args){
        String customerName;
        double loanAmount;
        double annualInterestRate = 0.07;
        int years;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Customer: ");
        customerName = scanner.nextLine();

        System.out.println("Loan: ");
        loanAmount = scanner.nextDouble();

        System.out.println("Years: ");
        years = scanner.nextInt();

        scanner.close();

        double interest = calculateInterest(loanAmount, annualInterestRate, years);
        double totalRepayment = calculateTotalRepayment(loanAmount, interest);
        double monthlyPayments = calculateMonthlyPayments(totalRepayment, years);
        String loanCategory = calculateLoanCategory(monthlyPayments);

        System.out.println("Customer:" + customerName);
        System.out.printf("Loan Amount: %.2f%nInterest: %.2f%nTotal Repayment: %.2f%nMonthly Payment: %.2f%n",loanAmount, interest, totalRepayment, monthlyPayments);
        System.out.println("Category: " + loanCategory);

    }

    public static double calculateInterest(double loanAmount, double annualInterestRate, int years){

        return (loanAmount * annualInterestRate) * years;
    }

    public static double calculateTotalRepayment(double loanAmount, double interest){

        return loanAmount + interest;
    }

    public static double calculateMonthlyPayments(double totalRepayment, int years){

        int months = years * 12;
        return totalRepayment / months;
    }

    public static String calculateLoanCategory(double monthlyPayments){

        if(monthlyPayments <= 120){
            return "Low Repayment.";
        }
        
        else if(monthlyPayments > 120 && monthlyPayments <= 240){
            return "Medium Repayment.";
        }

        else{
            return "High Repayment.";
        }

    }

}
