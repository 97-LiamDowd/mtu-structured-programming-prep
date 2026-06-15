import java.util.Scanner;

public class CalculateSquare {
    public static void main(String[] args){

        int userNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a whole number to be squared: ");
        userNumber = scanner.nextInt();

        scanner.close();

        int inputSquared = calculateSquare(userNumber);

        System.out.println("You're number squared is : " + inputSquared);
    }

    public static int calculateSquare(int userNumber){

        int inputSquared = userNumber * userNumber;
        return inputSquared;
    }
    
}
