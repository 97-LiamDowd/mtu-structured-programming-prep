import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args){

    int[] fiveNumbers = new int[5];
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter five number:");

    for(int i = 0; i < 5; i++){
        
        fiveNumbers[i] = scanner.nextInt();
        }

    System.out.println("Your numbers are: ");

    for(int i = 0; i < 5; i++){

        System.out.println(fiveNumbers[i]);
        }

    scanner.close();
    
    }
}
