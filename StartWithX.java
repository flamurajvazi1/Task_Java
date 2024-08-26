
    import java.util.Scanner;

    public class StartWithX {
        public static void main(String[] args) {
                       Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (word.startsWith("x")) {
                word = 'a' + word.substring(1);
            }

            System.out.println("Output: " + word+ "test");

            scanner.close();
        }
    }


