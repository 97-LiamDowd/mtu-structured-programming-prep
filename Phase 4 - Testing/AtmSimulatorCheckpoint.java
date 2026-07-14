import java.util.Scanner;

public class AtmSimulatorCheckpoint {
    public static void main(String[] args){
        //input: storedPin, inputPin, balance, withdrawl, deposit, option 1, option 2, option 3, option 4.
        //process: check pin, take option, update balance, repeat until option 4 selected.
        //output: balance.

        int storedPin = 1234;
        int inputPin;
        double balance = 500;
        double withdrawl;
        double deposit;
        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pin:");
        inputPin = scanner.nextInt();

        if(storedPin == inputPin){
            System.out.println("1. check balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
            option = scanner.nextInt();

            if(option == 1 || option == 2 || option == 3 || option == 4){

                while(option == 1){
                    System.out.printf("Balance: %.2f%n", balance);
                    System.out.println("1. check balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
                    option = scanner.nextInt();
                }

                while(option == 2){

                    System.out.println("Enter amount to withdraw:");
                    withdrawl = scanner.nextDouble();

                    if(withdrawl <= 0){
                        System.out.println("Invlaid withdrawl amount");
                    }

                    else if(withdrawl > balance){
                        System.out.println("Insufficent funds");
                    }

                    else{
                        balance = balance - withdrawl;
                        System.out.println("1. check balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
                        option = scanner.nextInt();
                    }

                }

                while(option == 3){

                    System.out.println("Enter amount to deposit");
                    deposit = scanner.nextDouble();

                    if(deposit <= 0){
                        System.out.println("Invalid deposit amount");
                    }

                    else{
                        balance = balance + deposit;
                        System.out.println("1. check balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
                        option = scanner.nextInt();
                    }

                }

                while(option == 4){
                    System.out.println("Thank you for using the ATM.");
                    break;
                }
                
                
            }

            else{
                System.out.println("Invalid menu option.");
            }

        }

        else{
            System.out.println("Incorrect pin.");
        }

        scanner.close();

    }

}
