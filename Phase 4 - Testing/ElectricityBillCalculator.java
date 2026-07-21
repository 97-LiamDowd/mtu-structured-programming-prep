import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args){
        //input: Customer name, units of electricity used;
        /*
        Process: take in inputs and store in variables name and electricity used
        then calculate energy charge, standing charge, subtotal, VAT amount, Final bill. Print bill to user.
        */
        //output: Customer name, Energy charge, Standing charge, subtotal, VAT amount, Final bill.
        
        String customerName;
        double electricityUsed;
        double unitRate = 0.35;
        double standingCharge = 12.50;
        double vatRate = 0.135;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name:");
        customerName = scanner.nextLine();

        System.out.println("Enter Electricity Used:");
        electricityUsed = scanner.nextDouble();

        scanner.close();

        double energyCharge = calculateEnergyCharge(electricityUsed, unitRate);
        double subtotal = calculateSubtotal(energyCharge, standingCharge);
        double vatAmount = calculateVatAmount(subtotal, vatRate);
        double finalBill = calculateFinalBill(subtotal, vatAmount);
        
        System.out.println("Customer: " + customerName);
        System.out.printf("Energy charge: %.2f%nStanding charge: %.2f%nSubtotal: %.2f%nVAT: %.2f%nFinal bill: %.2f", energyCharge, standingCharge, subtotal, vatAmount, finalBill);
    }

    public static double calculateEnergyCharge(double electricityUsed, double unitRate){
        return electricityUsed * unitRate;
    }

    public static double calculateSubtotal(double energyCharge, double standingCharge){
        return energyCharge + standingCharge;
    }

    public static double calculateVatAmount(double subtotal, double vatRate){
        return subtotal * vatRate;
    }

    public static double calculateFinalBill(double subtotal, double vatAmount){
        return subtotal + vatAmount;
    }

}
