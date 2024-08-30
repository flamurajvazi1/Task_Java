public class SwitchCase {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade){
            case 'B':
                System.out.println("Great Job");
                break;

            case 'A':
                System.out.println("Excellent");
                break;

            case 'C':
                System.out.println("Good");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
