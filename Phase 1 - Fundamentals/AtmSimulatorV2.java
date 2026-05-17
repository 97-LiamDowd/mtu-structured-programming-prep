import java.util.Scanner;

public class AtmSimulatorV2{
    public static void main(String[] args){

        
        int storedPin = 9999;
        int inputPin;
        int balanceOption = 1;
        int withdrawlOption = 2;
        int depositOption = 3;
        int exitOption = 4;
        int userChoice;
        double balance = 200;
        double withdrawl;
        double deposit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your pin: ");
        inputPin = scanner.nextInt();

        if(inputPin == storedPin){
        System.out.println("\nPlease select an option:\nFor Balance press 1\nFor Withdrawl press 2\nFor Deposit press 3\nFor Exit press 4");
        userChoice = scanner.nextInt();

            while(userChoice != exitOption){// will run while choice isn't 4  
            
                if(userChoice == balanceOption){ // if 1 is pressed this runs
                    userChoice = 0;
                    System.out.printf("\nYour balance is: %.2f\n", balance);//it is stuck on this
                }

                else if(userChoice == withdrawlOption){
                    System.out.println("\nHow much would you like to withdraw?");
                    withdrawl = scanner.nextDouble();

                    if(withdrawl > balance){
                        System.out.println("Insufficent funds");
                    }

                    else{
                        balance = balance - withdrawl;
                        System.out.printf("\nYou're new balance is: %.2f\n", balance);
                    }
                }

                else if(userChoice == depositOption){
                    System.out.println("\nHow much would you like to deposit?");
                    deposit = scanner.nextDouble();
                    balance = balance + deposit;
                    System.out.printf("\nYour new balance is: %.2f\n", balance);
                }

                else if(userChoice == exitOption){
                    System.out.println("Thank you for using our ATM");
                }

                System.out.println("\nPlease select an option:\nFor Balance press 1\nFor Withdrawl press 2\nFor Deposit press 3\nFor Exit press 4");
                userChoice = scanner.nextInt();  
            }

            System.out.println("\nThank you for using our ATM");

        }

        else{
            System.out.println("The pin you have entered is incorrect, please try again.");
        }

        scanner.close();

        

    }
}
