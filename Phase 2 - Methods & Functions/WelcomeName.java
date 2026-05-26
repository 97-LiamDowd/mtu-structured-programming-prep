import java.util.Scanner;

public class WelcomeName {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Please enter your name:");
        name = scanner.nextLine();

        scanner.close();

        welcome(name);
    
    }

    public static void welcome(String name){
        System.out.println("Welcome " + name);
        
    }
}