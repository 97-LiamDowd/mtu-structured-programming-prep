import java.util.Scanner;
import java.util.ArrayList;

public class BookRatingManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = getValidOption(scanner);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<Integer> ratings = new ArrayList<>();

        do {
            switch (option) {
                case 1:
                    titles.add(getValidTitle(scanner));
                    ratings.add(getValidRating(scanner));
                    break;

                case 2:
                    printValidList(titles, ratings);
                    break;

                case 3:
                    String bookSearch = getValidSearch(scanner, titles, ratings);
                    printValidSearchResult(titles, ratings, bookSearch);
                    break;

                case 4:
                    double average = getAverageRating(ratings);
                    System.out.println("The average rating is: " + average);
                    break;
        
                default:
                    break;
            }

            option = getValidOption(scanner);

        } while (option != 5);

        scanner.close();
    }

    public static void printValidMenu() {
        System.out.println("1. Add book\n2. Display\n3. Search for books\n4. Show average rating\n5. Exit");
        System.out.println("Please choose between option 1 and 5:");
    }

    public static int getValidOption(Scanner scanner) {
        int option = -1;
        
        while (true) {
            printValidMenu();
            
            while(!scanner.hasNextInt()) {
                System.out.println("Incorrect input, Must be an Integer:");
                scanner.nextLine();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            if(option > 0 && option < 6) {
                return option;
            }

            System.out.println("Invalid option, Must be between 1 - 5:");
        }
    }

    public static String getValidTitle(Scanner scanner) {

        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine().toLowerCase();

        while (true) {

            while (title.trim().isEmpty()) {
                System.out.println("Incorrect input, title cannot be blank:");
                title = scanner.nextLine();
            }

            return title;
        }
    }

    public static int getValidRating(Scanner scanner) {
        int rating;

        System.out.println("Rate the book from 1 - 10:");

        while (true) {

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input, must be a whole number:");
                scanner.nextLine();
            }

            rating = scanner.nextInt();

            if (rating >= 1 && rating <= 10) {
                return rating;
            }

            System.out.println("Invalid input, must be between 1 - 10:");
            scanner.nextLine();
        }
    }

    public static void printValidList(ArrayList<String> titles, ArrayList<Integer> ratings) {

        if (titles.size() == 0) {
            System.out.println("No books currently listed.");
        }

        else {
            for (int i = 0; i < titles.size(); i++) {
                System.out.println((i + 1) + ". " + titles.get(i) + " - " + ratings.get(i));
            }
        }
    }

    public static String getValidSearch (Scanner scanner, ArrayList<String> titles, ArrayList<Integer> ratings) {

        System.out.println("Enter title to search for:");
        String bookSearch = scanner.nextLine().toLowerCase();

        while (true) {

            while(bookSearch.isEmpty()) {
                System.out.println("Invalid input, cannot be blank:");
                bookSearch = scanner.nextLine().toLowerCase();
            }

            return bookSearch;
        }
    }

    public static void printValidSearchResult(ArrayList<String> titles, ArrayList<Integer> ratings, String bookSearch) {
        boolean found = false;
        int counter = 0;
        for (int i = 0; i < titles.size(); i++) {
            counter = i;
            if (bookSearch.equals(titles.get(i))) {
                found = true;
                break;
            }
        }



        if (found == false) {
            System.out.println("Book not found.");
        }

        else {
            System.out.println("Book found at index: " + counter + "\nThe rating is: " + ratings.get(counter));
        }
    }

    public static double getAverageRating (ArrayList<Integer> ratings) {
        
        double total = 0;

        for (int i = 0; i < ratings.size(); i++) {
            total += ratings.get(i);
        }

        if (ratings.size() == 0) {
            System.out.println("No books currently.");
            return 0;
        }

        else {
            return total / ratings.size();
        }
    }
}
