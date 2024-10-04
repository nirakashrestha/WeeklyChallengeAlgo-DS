/*CLARIFYING QUESTIONS
* Can there be no solution? - YES
* Do I need to find all possible solution? - NO
* --- return the first one you find.
*
* */


/*THOUGHT PROCESS
* Iterate through the array using the two indices.
* Determine whether any element at index j (where j > i) adds up to the target for each element at index i.
* Return the indices pair once it has been found.
* */


import java.util.Arrays;


public class TwoSum {
    public static void main(String[] args){
        TwoSum t = new TwoSum();
        int[] nums = {2,7,2,71};
        int[] result = t.twoSum(nums, 9);
        System.out.println("Input = " +  Arrays.toString(nums) + "\n" + Arrays.toString(result) + "\n");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = t.twoSum(nums2, target2);
        System.out.println("Input = " +  Arrays.toString(nums2) + "\n" + Arrays.toString(result2) + "\n");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = t.twoSum(nums3, target3);
        System.out.println("Input = " +  Arrays.toString(nums3) + "\n" + Arrays.toString(result3) + "\n");
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};

    }
}

/*TIME COMPLEXITY
* O(n^2)
* Each element in the array is compared wtih every other element.
* */

