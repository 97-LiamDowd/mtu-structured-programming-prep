import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        double userHeight;
        double userWeight;

        System.out.println("Please enter your height in metres: ");
        userHeight = scanner.nextDouble();

        System.out.println("Please enter your Weight in Kg: ");
        userWeight = scanner.nextDouble();

        scanner.close();

        double bmi = userBmi(userHeight, userWeight);

        System.out.println("Your BMI is: " + bmi);

    }

    public static double userBmi(double userHeight, double userWeight){
        
        double bmi = userWeight / (userHeight * userHeight);
        return bmi;

    }

}
