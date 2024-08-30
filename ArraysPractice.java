
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] arr1= new int[100];

        for (int i =0; i<arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));
        }
    }

