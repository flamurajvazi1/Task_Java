package Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};

        System.out.println("Common Elements");

        for (int element1 : arr1) {
            for(int element2: arr2){
                if(element1 == element2) {
                    System.out.println(element1 + "  ");
                }
            }
        }
    }
}
