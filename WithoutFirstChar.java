import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first word
        System.out.print("Enter the first word: ");
        String firstWord = scanner.nextLine();

        // Prompt user to enter the second word
        System.out.print("Enter the second word: ");
        String secondWord = scanner.nextLine();

        // Remove the first character from each word
        String firstWordWithoutFirstChar = firstWord.length() > 0 ? firstWord.substring(1) : "";
        String secondWordWithoutFirstChar = secondWord.length() > 0 ? secondWord.substring(1) : "";

        // Print the results
        System.out.println(firstWordWithoutFirstChar + secondWordWithoutFirstChar);

        // Close the scanner
        scanner.close();
    }
}
