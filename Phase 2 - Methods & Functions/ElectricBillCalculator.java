import java.util.Scanner;

public class ElectricBillCalculator {
    public static void main(String[] args){
        String customerName;
        double electricUsed;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you're name?");
        customerName = scanner.nextLine();

        System.out.println("How many kWh have you used?");
        electricUsed = scanner.nextDouble();

        scanner.close();

        double electricCost = calculateEnergyCharge(electricUsed);
        double standingCharge = caclculateStandingCharge();
        double subtotal = electricCost + caclculateStandingCharge();
        double vatAmount = calculateVat(subtotal);
        double finalBill = calculateTotalBill(subtotal, vatAmount);

        System.out.println("Customer: " + customerName);
        System.out.printf("%nEnergy Charge : %.2f%nStandingCharge : %.2f%nVat : %.2f%n--------------------%nTotal Bill : %.2f", electricCost, standingCharge, vatAmount, finalBill);
    }

    public static double calculateEnergyCharge(double electricUsed){

        double unitCost = 0.37;
        return electricUsed * unitCost;
    }

    public static double caclculateStandingCharge(){
        
        return 12.50;
    }

    public static double calculateVat(double subtotal){

        return subtotal * 0.135;
    }

    public static double calculateTotalBill(double subtotal, double vatAmount){

        return subtotal + vatAmount;
    }


}
