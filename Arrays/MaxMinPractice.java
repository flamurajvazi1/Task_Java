package Arrays;

public class MaxMinPractice {

    public static void main(String[] args) {
        int[] nums = {100, 20, 30, 40,1000, 5, 0,4, 3, 2, 1, 2, 1000, 300, 500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
