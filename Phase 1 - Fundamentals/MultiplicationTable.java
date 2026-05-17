import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        int inputNumber;
        int outputNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number:");
        inputNumber = scanner.nextInt();
        scanner.close();;

        for(int i = 0; i < 10; i++){
            outputNumber = (i + 1) * inputNumber;
            System.out.println((i + 1) + " x " + inputNumber + " = " + outputNumber);
        }

    }
}
