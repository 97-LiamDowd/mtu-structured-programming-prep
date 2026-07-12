import java.util.Scanner;

public class ArrayIndexing {
    public static void main(String[] args){

        int[] fiveNumbers = new int[5];
        int searchArray= 0;
        int numberIndex = -1;
        boolean found = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter five whole numbers:");
        
        for(int i = 0; i < fiveNumbers.length; i++){

            fiveNumbers[i] = scanner.nextInt();
        }

        System.out.println("Please enter a number to search for:");
        searchArray = scanner.nextInt();

        scanner.close();

        for(int i = 0; i < fiveNumbers.length; i++){
            
            

            if(fiveNumbers[i] == searchArray){
                found = true;
                numberIndex = i;
                break;
            }
        }

        if(found){
            System.out.println("Your number " + searchArray + " was found at index " + numberIndex + " in the array.");
        }

        else{
            System.out.println("Your number was not inside the array.");
        }
    }
}
