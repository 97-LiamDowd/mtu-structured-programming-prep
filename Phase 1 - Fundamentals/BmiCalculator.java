import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args){

        double height = 0;
        double weight = 0;
        double bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What height are you?");
        height = scanner.nextDouble();

        System.out.println("What weight are you?");
        weight = scanner.nextDouble();

        scanner.close();

        bmi = weight / (height * height); 
        System.out.println("BMI: " + bmi);

        


        
    }
}