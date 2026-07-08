import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){

        int[] fiveInputs = new int[5];
        int searchInput;
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Please eneter five whole numbers:");

        for(int i = 0; i < fiveInputs.length; i++){

            fiveInputs[i] = scanner.nextInt();
        }

        System.out.println("What number do you want to search for?");
        searchInput = scanner.nextInt();

        scanner.close();

        for(int i = 0; i < fiveInputs.length; i++){
            
            if(fiveInputs[i] == searchInput){

                found = true;
                break;
            }
        }

        if(found == true){

            System.out.println("The number " + searchInput + " is inside the array.");
        }

        else{

            System.out.println("The number " + searchInput + " is not inside the array.");
        }

    }
}
