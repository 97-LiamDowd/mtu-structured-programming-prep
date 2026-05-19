import java.util.Scanner;

public class NumberStatisticsAnalyzer {
    public static void main(String[] args){

        int userInput;
        int inputTotal = 0;
        double inputAverage;
        int highestNumber = 0;
        int lowestNumber = 101;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Please input a whole number between 1 and 100:");
            userInput = scanner.nextInt();

            inputTotal = inputTotal + userInput;

            if(userInput > highestNumber){
                highestNumber = userInput;
            }

            if(userInput < lowestNumber){
                lowestNumber = userInput;
            }
        }

        inputAverage = inputTotal/5;

        scanner.close();

        System.out.println("The total is: " + inputTotal);
        System.out.printf("The average of all the numbers is: %.2f\n", inputAverage);
        System.out.println("The highest number is: " + highestNumber);
        System.out.println("The lowest number is: " + lowestNumber);
        
    }
}
