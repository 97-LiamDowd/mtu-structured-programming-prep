import java.util.Scanner;

public class MultipleArrayIndexing {
    public static void main(String[] args){

        int[] fiveNumbers = new int[5];
        boolean found = false;
        int searchArray = 0;
        int numberIndex = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five whole numbers:");

        for(int i = 0; i < fiveNumbers.length; i++){

            fiveNumbers[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to search for:");
        searchArray = scanner.nextInt();

        scanner.close();

        for(int i = 0; i < fiveNumbers.length; i++){

            if(searchArray == fiveNumbers[i]){

                found = true;
                numberIndex = i;
                System.out.println("Your number: " + searchArray + ". was at index: " + numberIndex);
            }
        }

        if(found == false){

            System.out.println("Number not found.");
        }
    }
}
