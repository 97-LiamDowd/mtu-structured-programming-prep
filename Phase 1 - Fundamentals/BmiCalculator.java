import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args){

        double height = 0;
        double weight = 0;
        double bmi;

        Scanner input = new Scanner(System.in);

        System.out.println("What height are you?");
        height = input.nextDouble();

        System.out.println("What weight are you?");
        weight = input.nextDouble();

        bmi = weight / (height * height); 

        System.out.println("BMI: " + bmi);


        
    }
}