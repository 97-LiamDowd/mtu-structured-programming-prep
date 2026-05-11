import java.util.Scanner;

public class ReceiptGenerator {
    public static void main(String[] args){
        
        String itemName;
        double itemPrice = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the items name: ");
        itemName = scanner.nextLine();

        System.out.println("Type in the items price: ");
        itemPrice = scanner.nextDouble();

        scanner.close();

        double itemTax = itemPrice * 0.2;
        double total = itemPrice + itemTax;

        System.out.println("The tax is 20%");

        System.out.println("I am printing reciept now.");

        System.out.println("Item: " + itemName);
        System.out.printf("Price: %.2f\nTax: %.2f\nTotal: %.2f",itemPrice, itemTax, total);

    } 
}
