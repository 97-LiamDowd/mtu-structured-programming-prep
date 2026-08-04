import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        //Input
        //Declaring variables
        Scanner scanner = new Scanner(System.in);
        int ticket, age;

        //Get user age input
        System.out.println("Enter age:");
        age = scanner.nextInt();

        //process
        //using selection structure to find correct price.
        if (age < 5) {
            ticket = 0;
        }

        else if (age <= 17) {
            ticket = 8;
        }

        else if (age <= 64) {
            ticket = 15;
        }

        else {
            ticket = 10;
        }

        //output
        //print
        System.out.println("Age entered: " + age + "\nTicket price: " + ticket);

        scanner.close();
    }
}
