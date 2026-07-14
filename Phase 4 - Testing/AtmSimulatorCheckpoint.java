import java.util.Scanner;

public class AtmSimulatorCheckpoint{
    public static void main(String[] args){

        //input: stored pin, input pin, balance, deposit, withdrawal, option, scanner
        //process: take input pin, compare to stored pin, take in option, update balance
        //output: balance

        int storedPin = 1234;
        int inputPin;
        double balance = 500;
        double withdrawal;
        double deposit;
        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pin:");
        inputPin = scanner.nextInt();

        if( storedPin == inputPin ){
            System.out.println("1. Balance\n2. Wthdrawal\n3. Deposit\n4. Exit");
            option = scanner.nextInt();

            while( option != 4 ){

                if( option == 1 ){
                    System.out.printf("Balance: %.2f%n", balance);
                }

                else if( option == 2 ){
                    System.out.println("Enter Withdrawal Amount:");
                    withdrawal = scanner.nextDouble();

                    if( withdrawal > balance ){
                        System.out.println("Insufficient Funds!");

                    }

                    else if( withdrawal <= 0 ){
                        System.out.println("Invalid Input!");
                    }

                    else{
                        balance = balance - withdrawal;
                        System.out.printf("New Balance: %.2f%n", balance);
                    }
                }

                else if( option == 3){
                    System.out.println("Eneter Deposit Amount:");
                    deposit = scanner.nextDouble();

                    if(deposit <= 0){
                        System.out.println("Invalid Input!");
                    }

                    else{
                        balance = balance + deposit;
                        System.out.printf("New Balance: %.2f%n", balance);
                    }
                }

                else if( option == 4 ){
                    System.out.println("Thank you for using this ATM.");
                }

                else{
                    System.out.println("Invalid Menu Option!");
                }

                System.out.println("1. Balance\n2. Wthdrawal\n3. Deposit\n4. Exit");
                option = scanner.nextInt();
                
            }
        }

        else{
            System.out.println("Incorrect Pin!");
        }

        scanner.close();

    }

}