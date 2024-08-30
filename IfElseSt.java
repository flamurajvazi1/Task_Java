import java.util.Scanner;

public class IfElseSt {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Whats the temperature for today?");
        int temp = scan.nextInt();

        if(temp>20) {
            System.out.println("Wear a T shirt");
        }else if (temp > 30) {
            System.out.println("Wear a T shirt and short");
        }
        else if (temp >40) {
            System.out.println("Go to beach");
        }
        else{
            System.out.println("Temperature i s not high enough to wear t shirt");
        }
    }
}
