import java.util.Scanner;

public class TripEstimator{
    public static void main(String[] args){

        int distance;
        int efficiency;
        double price;
        double litresNeeded;
        double totalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance of your trip? ");
        distance = scanner.nextInt();

        System.out.print("how far does 1 litre get you? ");
        efficiency = scanner.nextInt();

        System.out.print("what is the cost of your fuel? ");
        price = scanner.nextDouble();

        scanner.close();

        litresNeeded = distance / efficiency;
        totalPrice = litresNeeded * price;

        System.out.print("You will need " + litresNeeded + "L and the trip will cost " + totalPrice);
    }
}
