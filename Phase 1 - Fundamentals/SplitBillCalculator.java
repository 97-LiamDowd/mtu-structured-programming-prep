import java.util.Scanner;

public class SplitBillCalculator {
    public static void main(String[] args){

        int people;
        double bill;
        double tip;
        double billSplit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        people = scanner.nextInt();

        System.out.print("Enter bill: ");
        bill = scanner.nextDouble();

        scanner.close();

        tip = bill * 0.1;
        billSplit = (bill + tip)/people;
        
        System.out.printf("The bill for each person is: %.2f", billSplit);
    }
}
