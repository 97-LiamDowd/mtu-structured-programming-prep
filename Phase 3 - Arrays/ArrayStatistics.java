import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args){

        double[] fiveNumbers = new double[5];
        double total = 0;
        double average = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 numbers:");

        for(int i = 0; i < fiveNumbers.length; i++){

            fiveNumbers[i] = scanner.nextDouble();

        }

        double highest = fiveNumbers[0];
        double lowest = fiveNumbers[0];

        scanner.close();

        for(int i = 0; i < fiveNumbers.length; i++){

            total = fiveNumbers[i] + total;
            

            if (fiveNumbers[i] > highest) {
                highest = fiveNumbers[i];
            }

            if (fiveNumbers[i] < lowest) {
                lowest = fiveNumbers[i];
            }
            
            
        }
        
        average = total/fiveNumbers.length;

        System.out.println(total);
        System.out.println(average);
        System.out.println(highest);
        System.out.println(lowest);
    }
}
