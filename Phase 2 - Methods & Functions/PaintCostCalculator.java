import java.util.Scanner;

public class PaintCostCalculator {
    public static void main(String[] args){

        double paintPrice = 7.50;
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Width of the area:");
        width = scanner.nextDouble();

        System.out.println("Please enter the Height of the area:");
        height = scanner.nextDouble();

        scanner.close();

        double area = areaCalculator(height, width);
        double totalCost = totalCost(paintPrice, area);

        System.out.printf("The area is %.2fm2%n", area);
        System.out.printf("The cost of paint needed to coever that will be %.2f euro%n", totalCost);


    }

    public static double areaCalculator (double height, double width){

        double area = height * width;
        return area;
    }

    public static double totalCost(double paintPrice, double area){

        double totalCost = paintPrice * area;
        return totalCost;
    }

    
}
