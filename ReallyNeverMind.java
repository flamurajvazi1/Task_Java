import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Check if the word ends with "ly"
        if (word.endsWith("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }

        // Close the scanner
        scanner.close();
    }
}
