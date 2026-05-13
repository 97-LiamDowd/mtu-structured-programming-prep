import java.util.Scanner;

public class TripEstimator{
    public static void main(String[] args){

        double distance;
        double efficiency;
        double price;
        double litresNeeded;
        double totalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance of your trip? ");
        distance = scanner.nextDouble();

        System.out.print("how far does 1 litre get you? ");
        efficiency = scanner.nextDouble();

        System.out.print("what is the cost of your fuel? ");
        price = scanner.nextDouble();

        scanner.close();

        litresNeeded = distance / efficiency;
        totalPrice = litresNeeded * price;

        System.out.printf("You will need %.2fL and the trip will cost %.2f", litresNeeded, totalPrice);
    }
}
