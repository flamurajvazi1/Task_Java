
package Arrays;

    import java.util.Arrays;
    public class ConcatTwoArrays {
        public static void main(String[] args) {

            int[] arr1= {18,23,46};
            int[] arr2 = {53, 0, 24};
            int[] arr3 = new int [arr1.length + arr2.length];
            int index =0;

            for(int elm : arr1) {
                arr3[index++] = elm;
            }

            for(int elm: arr2) {
                arr3[index++] = elm;
            }
            System.out.println(Arrays.toString(arr3));
            }
        }


