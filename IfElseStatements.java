import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats the temperature today ?");
        int temp = scan.nextInt();
        if(temp >20) {
            System.out.println("Wear a T Shirt");
        }
        else {
            System.out.println("Temperature is not high enough to wear a t shirt");
        }
        System.out.println("Statement outside if/else block");

        }
    }

