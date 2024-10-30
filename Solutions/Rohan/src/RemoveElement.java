/*CLARIFYING QUESTIONS
* Can the array be empty? - YES
* Can order of clements be changed? - YES
* What if all elements equal val? - Return 0
* */

/*THOUGHT PROCESS
* Use a counter k to track how many elements are not equal to val
* Loop through the array nums, and for each element not equal to val, place it at index k and increment k
* finally, the first k positions in nums will contain the valid elements*/


import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // index to store the next element not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();

        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = r.removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = r.removeElement(nums2, val2);
        System.out.println("Output: " + k2 + ", nums = " + Arrays.toString(nums2));
    }
}

/*TIME COMPLEXITY
* 0(n)
* because we loop through nums once*/