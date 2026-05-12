import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] arg){
        double base, height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What the Height of the right-angle triangle?");
        height = scanner.nextDouble();

        System.out.println("What is the base of the right-angle triangle?");
        base = scanner.nextDouble();

        scanner.close();

        double area = 0.5 * base * height;

        System.out.printf("The area of your right-angled triangle is: %.2f", area);

    }
    
}
