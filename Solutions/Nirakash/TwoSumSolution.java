package Solutions.Nirakash;

import java.util.Arrays;

public class TwoSumSolution {
    public static void main(String[] args) {

        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        // int[] nums = {3,2,4};
        // int target = 6;

        int[] nums = {3,3};
        int target = 6;

        int[] result = new int[2];
        int sum;
        boolean found = false;

        for (int currentIndex = 0; currentIndex < nums.length - 1; currentIndex++) {
            for (int nextIndex = currentIndex + 1; nextIndex < nums.length; nextIndex++) {
                sum = nums[currentIndex] + nums[nextIndex];
                if (sum == target) {
                    result[0] = currentIndex;
                    result[1] = nextIndex;
                    found = true;
                    break;
                }
            }

        }

        if (found)
            System.out.println(Arrays.toString(result));
        else
            System.out.println("Two Sum Target was not found");

    }
}
