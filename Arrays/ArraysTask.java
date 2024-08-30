package Arrays;
public class ArraysTask {

    public static void main(String[] args) {
        int[] numrat = {1, 2, 4, 5, 7, 9, 13, 18, 23, 54, 76};
        int evenCount = 0;
        int oddCount = 0;

        for (int numm : numrat) {
            if (numm % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
                System.out.println("even numbers:" + evenCount);
                System.out.println("odd numbers" + oddCount);
            }
        }
    }
}



