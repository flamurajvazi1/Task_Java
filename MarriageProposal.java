import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Will you marry me?");
            answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                System.out.println("Congrats.");
            } else if (answer.equals("no")) {
                System.out.println("Goodbye.");
            } else {
                System.out.println("Invalid answer, please re-enter.");
            }
        } while (!answer.equals("yes") && !answer.equals("no"));

        scanner.close();
    }
}

