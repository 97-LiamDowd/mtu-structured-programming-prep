import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args){

        
        int pin = 9999;
        double balance = 200;
        double withdrawl;
        double deposit;
        int balanceOption = 1;
        int withdrawlOption = 2;
        int depositOption = 3;
        int userChoice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your pin: ");
        pin = scanner.nextInt();

        if(pin == 9999){

            System.out.println("Please select an option:\nFor Balance press 1\nFor Withdrawl press 2\nFor Deposit press 3\nFor Exit press 4");
            userChoice = scanner.nextInt();

            if(userChoice == balanceOption){
                System.out.printf("\nYour balance is: %.2f", balance);
            }

            else if(userChoice == withdrawlOption){
                System.out.println("How much would you like to withdraw?");
                withdrawl = scanner.nextDouble();

                if(withdrawl > balance){
                    System.out.println("Insufficent funds");
                }

                else{
                    balance = balance - withdrawl; // unsure if I need to make it so balance ust be updated
                    System.out.printf("\nYou're new balance is: %.2f", balance);
                }
            }

            else if(userChoice == depositOption){
                System.out.println("How much would you like to deposit?");
                deposit = scanner.nextDouble();
                balance = balance + deposit;
                System.out.printf("Your new balance is: %.2f", balance);
            }

            else{
                System.out.println("Thank you for using our ATM");
            }
            
            
        }

        else{
            System.out.println("The pin you have entered is incorrect, please try again.");
        }

        scanner.close();

        

    }
}
