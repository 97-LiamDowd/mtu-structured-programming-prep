import java.util.Scanner;

public class AtmSimulatorCheckpoint {
    public static void main(String[] args){

        //input - stored pin, input pin, balance, withdrawal, deposit, option, scanner.
        //process - take input pin compare to stored pin. take input for option. create each option. update balance
        //output - balance


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
            
            System.out.println("1. Balance\n2. Withdrawal\n3. Deposit\n4. Exit");
            option = scanner.nextInt();

            if( option == 1 || option == 2 || option == 3 || option == 4 ){

                while( option != 4 ){

                    if( option == 1 ){

                        System.out.printf("Balance: %.2f%n", balance);
                        System.out.println("1. Balance\n2. Withdrawal\n3. Deposit\n4. Exit");
                        option = scanner.nextInt();

                    }

                    else if( option == 2 ){

                        System.out.println("Withdrawal amount:");
                        withdrawal = scanner.nextDouble();

                        if( withdrawal > balance ){

                            System.out.println("Insufficent funds");

                        }

                        else if( withdrawal <= 0 ){

                            System.out.println("Invalid input");

                        }

                        else{
                            
                            balance = balance - withdrawal;
                            System.out.println("1. Balance\n2. Withdrawal\n3. Deposit\n4. Exit");
                            option = scanner.nextInt();  
                        
                        }
                        
                    }

                    else if( option == 3 ){

                        System.out.println("Deposit amount:");
                        deposit = scanner.nextDouble();

                        if( deposit <= 0){

                            System.out.println("Invalid input");

                        }

                        else{

                            balance = balance + deposit;
                            System.out.println("1. Balance\n2. Withdrawal\n3. Deposit\n4. Exit");
                            option = scanner.nextInt();

                        }

                    }

                }

            }

            else{

                System.out.println("Invalid menu option");

            }

        }

        else{

            System.out.println("Incorrect Pin");
        
        }

        scanner.close();

    }

}
