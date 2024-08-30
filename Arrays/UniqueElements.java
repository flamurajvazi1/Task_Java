package Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,4,5};
        for (int num : numbers) {
            boolean isUnique = true;

            for(int element : numbers) {
                if(num==element && num != element) {
                        isUnique= false;
                        break;

                    }
                }
                if (isUnique){
                    System.out.println(num + " ");
                }
            }
        }
    }

