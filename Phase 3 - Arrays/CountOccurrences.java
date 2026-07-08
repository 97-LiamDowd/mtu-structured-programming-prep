import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args){

        int[] fiveInputs = new int[5];
        int counter = 0;
        int searchArray;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five whole numbers:");

        for(int i = 0; i < fiveInputs.length; i++){

            fiveInputs[i] = scanner.nextInt();
        }

        System.out.println("Please enter a number to search for:");
        searchArray = scanner.nextInt();

        scanner.close();

        for(int i = 0; i < fiveInputs.length; i++){

            if(fiveInputs[i] == searchArray){
                counter = counter + 1;
            }

        }

        System.out.println("The number " + searchArray + " appears " + counter + " times.");
    }
}
