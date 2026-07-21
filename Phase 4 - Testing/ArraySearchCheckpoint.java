import java.util.Scanner;

public class ArraySearchCheckpoint {
    public static void main(String[] args){
        //Input: Inputs[], found, scanner, inputSearch, counter
        //Process: take 5 inputs -> store 5 inputs in array -> take input -> store in inputSearch -> search array for number and how many times it appears.
        //Output: counter, matching indexes.

        int inputs[] = new int[5];
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        int inputSearch;
        int counter = 0;

        System.out.println("Enter five numbers:");

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to search for:");
        inputSearch = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == inputSearch) {
                found = true;
                counter = counter + 1;
                
            }
        }

        if (found == true) {
            System.out.println(inputSearch + " was found.\nIt was found " + counter + " time(s).");
        }

        else{
            System.out.println(inputSearch + " was not found.");
        }
    }
}
