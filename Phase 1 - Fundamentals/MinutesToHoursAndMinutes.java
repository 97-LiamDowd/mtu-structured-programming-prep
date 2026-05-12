import java.util.Scanner;

public class MinutesToHoursAndMinutes {
    public static void main(String[] args){

        int totalMinutes;
        int totalHours;
        int remainderMinutes;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any amount of minutes and I will convert it to hours and minutes: ");
        totalMinutes = scanner.nextInt();

        scanner.close();

        totalHours = totalMinutes / 60;

        remainderMinutes = (totalMinutes % 60);

        System.out.println(totalHours + "hrs and " + remainderMinutes + " mins");
    }
}
