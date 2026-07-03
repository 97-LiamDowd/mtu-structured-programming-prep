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
    }

     public static double calculateEnergyCharge(double electricUsed){

        double unitCost = 0.37;

        double electricCost = electricUsed * unitCost;

        return electricCost;
    }
}
