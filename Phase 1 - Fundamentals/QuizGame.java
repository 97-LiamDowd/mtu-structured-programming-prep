import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){

        //variables
        int userScore = 0;
        int winScore = 3;
        int userChoice;
        int correctAnswer;
        Scanner scanner = new Scanner(System.in);

        //Game intro
        System.out.println("Welcome to the Quiz");
        System.out.println("You will be given three quuestion. Each question with have 4 answers. Select the correct ones to win.\n");
        
        //Questiion 1
        System.out.println("Question 1:\nWhat is the capital of Ireland");
        System.out.println("1. Dublin\n2. London\n3. New York\n4. Sydney");
        System.out.println("Which do you choose? ");

        userChoice = scanner.nextInt();
        correctAnswer = 1;

        if(userChoice == correctAnswer){
            userScore++;
            System.out.println("\nCorrect!!");
        }
        else{
            System.out.println("\nIncorrect!!");
        }

        System.out.println("Your score is " + userScore + "/3");        

        //Qestion 2
        System.out.println("\nQuestion 2:\nWhat is the capital of Germany");
        System.out.println("1. Kabul\n2. Tokyo\n3. Berlin\n4. Paris");
        System.out.println("Which do you choose? ");

        userChoice = scanner.nextInt();
        correctAnswer = 3;

        if(userChoice == correctAnswer){
            userScore++;
            System.out.println("\nCorrect!!");
        }
        else{
            System.out.println("\nIncorrect!!");
        }

        System.out.println("Your score is " + userScore + "/3"); 

        //Question 3
        System.out.println("\nQuestion 3:\nWhat is the capital of Canada");
        System.out.println("1. Tripoli\n2. Prague\n3. Saint Johns\n4. Ottawa");
        System.out.println("Which do you choose? ");

        userChoice = scanner.nextInt();
        correctAnswer = 4;

        if(userChoice == correctAnswer){
            userScore++;
            System.out.println("\nCorrect!!");
        }
        else{
            System.out.println("\nIncorrect!!");
        }

        scanner.close();

        //Final results
        if(userScore == winScore){
           System.out.println("You got " + userScore + " out of 3.");
           System.out.println("Congrats you won!!!"); 
        }
        
        else{
            System.out.println("You got " + userScore + " out of 3.");
            System.out.println("Sorry you lose!!!"); 
        }

        
    }
}
