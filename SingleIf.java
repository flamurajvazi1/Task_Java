public class SingleIf {
    public static void main(String[] args) {
        int temp = 40;

        if (temp > 200) {
            System.out.println("It's extremely hot! That's way beyond boiling!");
        }

        if (temp > 40) {
            System.out.println("It's boiling out there!");
        }

        if (temp <= 40) {
            System.out.println("Wear a T-shirt.");
        }
    }
}
